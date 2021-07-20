package com.techelevator.projects.dao;

import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcProjectDao implements ProjectDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcProjectDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Project getProject(Long projectId) {
        return new Project();
    }

    @Override
    public Project getProjectByName(String name) {
        return new Project();
    }

    @Override
    public List<Project> getAllProjects() {
        return new ArrayList<Project>();
    }

    @Override
    public void createProject(Project newProject) {
    }

    @Override
    public void deleteProject(Long projectId) {

    }

}
