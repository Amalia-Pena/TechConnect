package com.techelevator.dao;

import com.techelevator.model.City;
import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcCityDao implements CityDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcCityDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public City getCity(long cityId) {
        String sql = "SELECT city_id, city_name, state_abbreviation, population, area " +
                     "FROM city " +
                     "WHERE city_id = ?;";
        return (City) jdbcTemplate.queryForObject(sql, new CityRowMapper(), new Object[]{cityId} );
    }

    @Override
    public List<City> getCitiesByState(String stateAbbreviation) {
        String sql = "SELECT city_id, city_name, state_abbreviation, population, area " +
                     "FROM city " +
                     "WHERE state_abbreviation = ?;";
        return (List<City>) jdbcTemplate.query(sql, new CityRowMapper(), new Object[]{stateAbbreviation});
    }

    @Override
    public void createCity(City city) {
        String sql = "INSERT INTO city (city_name, state_abbreviation, population, area) " +
                     "VALUES (?, ?, ?, ?);";
        jdbcTemplate.update(sql,
               city.getCityName(), city.getStateAbbreviation(), city.getPopulation(), city.getArea());
    }

    @Override
    public void updateCity(City city) {
        String sql = "UPDATE city " +
                    "SET city_name = ?, state_abbreviation = ?, population = ?, area = ? " +
                    "WHERE city_id = ?;";
        jdbcTemplate.update(sql, city.getCityName(), city.getStateAbbreviation(), city.getPopulation(),
                city.getArea(), city.getCityId());
    }

    @Override
    public void deleteCity(long cityId) {
        String sql = "DELETE FROM city WHERE city_id = ?;";
        jdbcTemplate.update(sql, cityId);
    }

    class CityRowMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            City city = new City();
            city.setCityId(resultSet.getLong("city_id"));
            city.setCityName(resultSet.getString("city_name"));
            city.setStateAbbreviation(resultSet.getString("state_abbreviation"));
            city.setPopulation(resultSet.getLong("population"));
            city.setArea(resultSet.getDouble("area"));
            return city;
        }
    }
}
