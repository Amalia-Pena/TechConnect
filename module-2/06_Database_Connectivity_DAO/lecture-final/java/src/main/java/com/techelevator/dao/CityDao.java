package com.techelevator.dao;

import com.techelevator.model.City;

import java.util.List;

public interface CityDao {

    City getCity(long cityId);

    List<City> getCitiesByState(String stateAbbreviation);

    void createCity(City city);

    void updateCity(City city);

    void deleteCity(long cityId);
}
