package com.biedin.openweather.repository;

import com.biedin.openweather.repository.entity.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CityRepository extends CrudRepository<City, Long> {

    @Query(value = "SELECT name FROM city", nativeQuery = true)
    List<String> getAllNamesCity();

    Page<City> findCityByCountry(String country, Pageable pageable);

    Page<City> findAll(org.springframework.data.domain.Pageable pageable);
}
