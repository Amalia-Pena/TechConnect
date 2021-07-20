package com.techelevator.projects;

import com.techelevator.projects.dao.JdbcEmployeeDao;
import com.techelevator.projects.model.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JdbcEmployeeDao.class)
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "/test-data.sql")
@Import(TestConfig.class)
public class JdbcEmployeeDaoTests {

    private static final Employee EMPLOYEE_1 =
            new Employee(1L, 1L, "First1", "Last1",
                    LocalDate.parse("1981-01-01"), LocalDate.parse("2001-01-02"));
    private static final Employee EMPLOYEE_2 =
            new Employee(2L, 2L, "First2", "Last2",
                    LocalDate.parse("1982-02-01"), LocalDate.parse("2002-02-03"));
    private static final Employee EMPLOYEE_3 =
            new Employee(3L, 1L, "First3", "Last3",
                    LocalDate.parse("1983-03-01"), LocalDate.parse("2003-03-04"));

    private JdbcEmployeeDao sut;
    @Autowired
    private DataSource dataSource;

    @Before
    public void setup() {
        sut = new JdbcEmployeeDao(dataSource);
    }

    @After
    public void rollback() throws SQLException {
        dataSource.getConnection().rollback();
        sut = null;
    }


    @Test
    public void getAllEmployees_returns_list_of_all_employees() {
        List<Employee> employees = sut.getAllEmployees();

        Assert.assertEquals("getAllEmployees failed to return all employees", 3, employees.size());
        assertEmployeesMatch("getAllEmployees returned wrong or partial data", EMPLOYEE_1, employees.get(0));
        assertEmployeesMatch("getAllEmployees returned wrong or partial data", EMPLOYEE_2, employees.get(1));
        assertEmployeesMatch("getAllEmployees returned wrong or partial data", EMPLOYEE_3, employees.get(2));
    }

    @Test
    public void searchEmployeesByName_finds_exact_matches() {
        List<Employee> employees = sut.searchEmployeesByName("First1", "Last1");
        Assert.assertEquals("searchEmployeesByName returned the wrong number of matches for an exact match",
                1, employees.size());
        assertEmployeesMatch("searchEmployeesByName returned wrong or partial data", EMPLOYEE_1, employees.get(0));

        employees = sut.searchEmployeesByName("First2", "");
        Assert.assertEquals("searchEmployeesByName returned the wrong number of matches for an exact match",
                1, employees.size());
        assertEmployeesMatch("searchEmployeesByName returned wrong or partial data", EMPLOYEE_2, employees.get(0));

        employees = sut.searchEmployeesByName("", "Last3");
        Assert.assertEquals("searchEmployeesByName returned the wrong number of matches for an exact match",
                1, employees.size());
        assertEmployeesMatch("searchEmployeesByName returned wrong or partial data", EMPLOYEE_3, employees.get(0));
    }

    @Test
    public void searchEmployeesByName_finds_partial_matches() {
        List<Employee> employees = sut.searchEmployeesByName("irst", "ast");
        Assert.assertEquals("searchEmployeesByName returned the wrong number of matches for a partial match",
                3, employees.size());

        employees = sut.searchEmployeesByName("first", "last");
        Assert.assertEquals("searchEmployeesByName returned the wrong number of matches for a case-insensitive match",
                3, employees.size());

        employees = sut.searchEmployeesByName("FIRST", "LAST");
        Assert.assertEquals("searchEmployeesByName returned the wrong number of matches for a case-insensitive match",
                3, employees.size());

        employees = sut.searchEmployeesByName("", "");
        Assert.assertEquals("searchEmployeesByName should return all employees when passed 2 empty strings",
                3, employees.size());
    }

    @Test
    public void searchEmployeesByName_finds_no_matches_for_names_not_found() {
        List<Employee> employees = sut.searchEmployeesByName("TEST", "TEST");
        Assert.assertEquals("searchEmployeesByName returned matches for full name not in database",
                0, employees.size());

        employees = sut.searchEmployeesByName("TEST", "Last1");
        Assert.assertEquals("searchEmployeesByName should only return matches when both names match",
                0, employees.size());

        employees = sut.searchEmployeesByName("First1", "TEST");
        Assert.assertEquals("searchEmployeesByName should only return matches when both names match",
                0, employees.size());
    }

    @Test
    public void getEmployeesByProjectId_returns_all_employees_for_project() {
        List<Employee> employees = sut.getEmployeesByProjectId(1L);
        Assert.assertEquals("getEmployeesByProjectId returned wrong number of employees",
                1, employees.size());
        assertEmployeesMatch("getEmployeesByProjectId returned wrong or partial data", EMPLOYEE_1, employees.get(0));

        employees = sut.getEmployeesByProjectId(2L);
        Assert.assertEquals("getEmployeesByProjectId returned wrong number of employees",
                2, employees.size());
        assertEmployeesMatch("getEmployeesByProjectId returned wrong or partial data", EMPLOYEE_2, employees.get(0));
        assertEmployeesMatch("getEmployeesByProjectId returned wrong or partial data", EMPLOYEE_3, employees.get(1));

        employees = sut.getEmployeesByProjectId(99L);
        Assert.assertEquals("getEmployeesByProjectId returned employees for project id not in database",
                0, employees.size());
    }

    @Test
    public void employee_added_to_project_is_in_list_of_employees_for_project() {
        sut.addEmployeeToProject(1L, 3L);
        List<Employee> employees = sut.getEmployeesByProjectId(1L);
        Assert.assertEquals("addEmployeeToProject didn't increase number of employees assigned to project",
                2, employees.size());
        assertEmployeesMatch("addEmployeeToProject assigned wrong employee to project", EMPLOYEE_3, employees.get(1));
    }

    @Test
    public void employee_removed_from_project_is_not_in_list_of_employees_for_project() {
        sut.removeEmployeeFromProject(2L, 3L);
        List<Employee> employees = sut.getEmployeesByProjectId(2L);
        Assert.assertEquals("removeEmployeeFromProject didn't decrease number of employees assigned to project",
                1, employees.size());
        assertEmployeesMatch("removeEmployeeFromProject removed wrong employee from project", EMPLOYEE_2, employees.get(0));
    }

    @Test
    public void getEmployeesWithoutProjects_finds_all_employees_not_assigned_to_projects() throws SQLException {
        List<Employee> employees = sut.getEmployeesWithoutProjects();
        Assert.assertEquals("getEmployeesWithoutProjects returned employees assigned to projects",
                0, employees.size());
        String removeSql = "DELETE FROM project_employee WHERE project_id = 1 AND employee_id = 1;";
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ByteArrayResource(removeSql.getBytes()));
        employees = sut.getEmployeesWithoutProjects();
        Assert.assertEquals("getEmployeesWithoutProjects returned the wrong number of employees without projects",
                1, employees.size());
    }

    private void assertEmployeesMatch(String message, Employee expected, Employee actual) {
        Assert.assertEquals(message, expected.getId(), actual.getId());
        Assert.assertEquals(message, expected.getDepartmentId(), actual.getDepartmentId());
        Assert.assertEquals(message, expected.getFirstName(), actual.getFirstName());
        Assert.assertEquals(message, expected.getLastName(), actual.getLastName());
        Assert.assertEquals(message, expected.getBirthDate(), actual.getBirthDate());
        Assert.assertEquals(message, expected.getHireDate(), actual.getHireDate());
    }
}
