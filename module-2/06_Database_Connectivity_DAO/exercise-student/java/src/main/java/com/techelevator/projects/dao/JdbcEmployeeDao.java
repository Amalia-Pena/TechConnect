package com.techelevator.projects.dao;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcEmployeeDao implements EmployeeDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcEmployeeDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<Employee>();
    }

    @Override
    public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
        List<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee());
        return emps;
    }

    @Override
    public List<Employee> getEmployeesByProjectId(Long projectId) {
        return new ArrayList<Employee>();
    }

    @Override
    public void addEmployeeToProject(Long projectId, Long employeeId) {
    }

    @Override
    public void removeEmployeeFromProject(Long projectId, Long employeeId) {
    }

    @Override
    public List<Employee> getEmployeesWithoutProjects() {
        return new ArrayList<Employee>();
    }

}
