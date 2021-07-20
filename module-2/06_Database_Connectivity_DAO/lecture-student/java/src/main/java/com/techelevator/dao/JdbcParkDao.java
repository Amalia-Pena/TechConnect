package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(long parkId) {
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
    }

    @Override
    public void createPark(Park park) {
    }

    @Override
    public void updatePark(Park park) {
    }

    @Override
    public void deletePark(long parkId) {
    }

    @Override
    public void addParkToState(long parkId, String stateAbbreviation) {
    }

    @Override
    public void removeParkFromState(long parkId, String stateAbbreviation) {
    }

    class ParkRowMapper implements RowMapper<Park> {

        @Override
        public Park mapRow(ResultSet resultSet, int i) throws SQLException {
        }
    }
}
