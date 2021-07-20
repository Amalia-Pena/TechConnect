package com.techelevator.projects;

import com.techelevator.projects.dao.JdbcProjectDao;
import com.techelevator.projects.model.Project;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JdbcProjectDao.class)
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "/test-data.sql")
@Import(TestConfig.class)
public class JdbcProjectDaoTests {

    private static final Project PROJECT_1 =
            new Project(1L, "Project 1", LocalDate.parse("2000-01-02"), LocalDate.parse("2000-12-31"));
    private static final Project PROJECT_2 =
            new Project(2L, "Project 2", null, null);
    private static final Project testProject =
            new Project(99L, "Test Project", LocalDate.now(), LocalDate.now().plusDays(1));

    @Autowired
    private DataSource dataSource;
    private JdbcProjectDao sut;

    @Before
    public void setup() {
        sut = new JdbcProjectDao(dataSource);
    }

    @After
    public void rollback() throws SQLException {
        dataSource.getConnection().rollback();
        sut = null;
    }

    @Test
    public void getProject_returns_correct_project_for_id() {
        Project project = sut.getProject(1L);
        assertNotNull("getProject returned null", project);
        assertProjectsMatch("getProject returned wrong or partial data", PROJECT_1, project);

        project = sut.getProject(2L);
        assertProjectsMatch("getProject returned wrong or partial data", PROJECT_2, project);
    }

    @Test
    public void getProject_returns_null_when_id_not_found() {
        Project project = sut.getProject(99L);
        assertNull("getProject failed to return null for id not in database", project);
    }

    @Test
    public void getAllProjects_returns_list_of_all_projects() {
        List<Project> projects = sut.getAllProjects();

        assertEquals("getAllProjects failed to return all projects", 2, projects.size());
        assertProjectsMatch("getAllProjects returned wrong or partial data", PROJECT_1, projects.get(0));
        assertProjectsMatch("getAllProjects returned wrong or partial data", PROJECT_2, projects.get(1));
    }

    @Test
    public void created_project_has_expected_values_when_retrieved() {
        Project actual;
        sut.createProject(testProject);
        JdbcTemplate t = new JdbcTemplate(dataSource);
        String getByNameSql = "select * from project where name = ?";
        try {
            actual = (Project) t.queryForObject(getByNameSql, new ProjectRowMapper(), new Object[]{"Test Project"});
        } catch (EmptyResultDataAccessException e) {
            actual = new Project();
        }

        testProject.setId(actual.getId());
        assertProjectsMatch("createProject returned project with wrong or partial data", testProject, actual);
    }

    @Test
    public void getProjectByName() {
        Project p = sut.getProjectByName("Project 1");
        PROJECT_1.setId(p.getId());
        assertProjectsMatch("Could not get project by name", PROJECT_1, p);
    }

    @Test
    public void deleted_project_cant_be_retrieved() {
        sut.deleteProject(1L);
        Project project = getProject(1L);
        assertNull("deleteProject failed to remove project from database", project);
    }

    private void assertProjectsMatch(String message, Project expected, Project actual) {
        assertEquals(message, expected.getId(), actual.getId());
        assertEquals(message, expected.getName(), actual.getName());
        assertEquals(message, expected.getFromDate(), actual.getFromDate());
        assertEquals(message, expected.getToDate(), actual.getToDate());
    }


    private Project getProject(Long id) {
        String getOneSql = "select * from project where project_id = ?";
        JdbcTemplate t = new JdbcTemplate(dataSource);
        try {
            return (Project) t.queryForObject(getOneSql, new ProjectRowMapper(), new Object[]{id});
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}

class ProjectRowMapper implements RowMapper {
    @Override
    public Project mapRow(ResultSet resultSet, int i) throws SQLException {
        Project p = new Project();
        try {
            p.setId(resultSet.getLong("project_id"));
            p.setName(resultSet.getString("name"));
            if (resultSet.getString("from_date") != null) {
                p.setFromDate(LocalDate.parse(resultSet.getString("from_date")));
            }
            if (resultSet.getString("to_date") != null) {
                p.setToDate(LocalDate.parse(resultSet.getString("to_date")));
            }
            return p;
        } catch (SQLException e) {
            return null;
        }
    }
}

