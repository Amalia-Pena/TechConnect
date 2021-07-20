package com.techelevator.projects.dao;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcDepartmentDao implements DepartmentDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcDepartmentDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Department getDepartment(Long id) {
        return new Department(999L, "not implemented");
    }

    @Override
    public List<Department> getAllDepartments() {
        return new ArrayList<Department>();
    }

    @Override
    public void updateDepartment(Department updatedDepartment) {

    }

}



