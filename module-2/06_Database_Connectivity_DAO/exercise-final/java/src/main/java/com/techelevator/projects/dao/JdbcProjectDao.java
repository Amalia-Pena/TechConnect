package com.techelevator.projects.dao;

import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class JdbcProjectDao implements ProjectDao {

    public static final String createProjSql = "INSERT INTO project (name, from_date, to_date) VALUES (?, ?, ?);";
    public static final String deleteProjEmpForeignKeySql = "delete from project_employee where project_employee.project_id = ?";
    public static final String deleteProjectSql = "delete from project where project_id = ?";
    public static final String getAllProjSql = "Select * from project";
    public static final String getProjByIdSql = "Select * from project where project_id = ?;";
    public static final String getProjByNameSql = "Select * from project where name = ?";
    private final JdbcTemplate jdbcTemplate;

    public JdbcProjectDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Project getProject(Long projectId) {
        List<Project> result = jdbcTemplate.query(getProjByIdSql, new ProjectRowMapper(), new Object[]{projectId});
        if (result.size() == 0) {
            return null;
        }
        return result.get(0);
    }

    @Override
    public Project getProjectByName(String name) {
        List<Project> result = jdbcTemplate.query(getProjByNameSql, new ProjectRowMapper(), new Object[]{name});
        if (result.size() == 0) {
            return null;
        }
        return result.get(0);
    }

    @Override
    public List<Project> getAllProjects() {
        return jdbcTemplate.query(getAllProjSql, new ProjectRowMapper());
    }

    @Override
    public void createProject(Project newProject) {
        List<Project> overlaps = jdbcTemplate.query("select name, from_date, to_date from project\n" +
                "where (from_date, to_date) overlaps (?, ?);", new ProjectRowMapper(),
                newProject.getFromDate().minusDays(1), newProject.getToDate().plusDays(1));
        if(overlaps.size() == 0) {
            jdbcTemplate.update(createProjSql, newProject.getName(), newProject.getFromDate(), newProject.getToDate());
        } else {
            System.out.println("Project overlaps dates of other project.");
        }
    }

    @Override
    public void deleteProject(Long projectId) {
        jdbcTemplate.update(deleteProjEmpForeignKeySql, projectId);
        jdbcTemplate.update(deleteProjectSql, projectId);
    }


    private class ProjectRowMapper implements RowMapper {
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
}
