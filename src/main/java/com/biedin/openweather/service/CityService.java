package com.biedin.openweather.service;

import com.biedin.openweather.repository.CityRepository;
import com.biedin.openweather.repository.entity.City;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public void saveAllCities(List<City> cityList) {
        Iterable<City> cities = cityRepository.saveAll(cityList);
    }

    public Page<City> getAllCities(Pageable pageable) {
        return cityRepository.findAll(pageable);
    }

    public List<String> getAllNamesOfCity() {
        List<City> cityList = Lists.newArrayList(cityRepository.findAll());
        return cityList.stream().map(City::getName).collect(Collectors.toList());
    }

    public List<String> getNames() {
        return cityRepository.getAllNamesCity();
    }

    public Page<City> getAllCityByCountry(String country, Pageable pageable) {
        return cityRepository.findCityByCountry(country, pageable);
    }

}
