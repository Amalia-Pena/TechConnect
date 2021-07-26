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
        String sql = "SELECT park_id, park_name, date_established, area, has_camping " +
                "FROM park " +
                "WHERE park_id = ?";
        return jdbcTemplate.queryForObject(sql, new ParkRowMapper(), parkId);
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        String sql = "SELECT p.park_id, park_name, date_established, area, has_camping " +
                "FROM park p " +
                "JOIN park_state ps ON p.park_id = ps.park_id " +
                "WHERE state_abbreviation = ?;";
        return jdbcTemplate.query(sql, new ParkRowMapper(), stateAbbreviation);
    }

    @Override
    public void createPark(Park park) {
        String sql = "INSERT INTO park (park_name, date_established, area, has_camping) " +
                "VALUES (?, ?, ?, ?) RETURNING park_id;";
        jdbcTemplate.update(sql,
                park.getParkName(), park.getDateEstablished(), park.getArea(), park.getHasCamping());
    }

    @Override
    public void updatePark(Park park) {
        String sql = "UPDATE park " +
                "SET park_name = ?, date_established = ?, area = ?, has_camping = ? " +
                "WHERE park_id = ?;";

        jdbcTemplate.update(sql,
                park.getParkName(), park.getDateEstablished(), park.getArea(), park.getHasCamping());
    }

    @Override
    public void deletePark(long parkId) {
        String sql = "DELETE FROM park_state WHERE park_id = ?;";
        jdbcTemplate.update(sql, parkId);
        sql = "DELETE FROM park WHERE park_id = ?";
        jdbcTemplate.update(sql, parkId);
    }

    @Override
    public void addParkToState(long parkId, String stateAbbreviation) {
        String sql = "INSERT INTO park_state (park_id, state_abbreviation) VALUES (?, ?);";
        jdbcTemplate.update(sql, parkId, stateAbbreviation);
    }

    @Override
    public void removeParkFromState(long parkId, String stateAbbreviation) {
        String sql = "DELETE FROM park_state WHERE park_id = ? AND state_abbreviation = ?;";
        jdbcTemplate.update(sql, parkId, stateAbbreviation);
    }

    class ParkRowMapper implements RowMapper<Park> {

        @Override
        public Park mapRow(ResultSet resultSet, int i) throws SQLException {
            Park park = new Park();
            park.setParkId(resultSet.getLong("park_id"));
            park.setParkName(resultSet.getString("park_name"));
            park.setDateEstablished(resultSet.getDate("date_established").toLocalDate());
            park.setArea(resultSet.getDouble("area"));
            park.setHasCamping(resultSet.getBoolean("has_camping"));
            return park;
        }
    }
}
