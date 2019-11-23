package com.biedin.openweather.controller;

import com.biedin.openweather.repository.entity.City;
import com.biedin.openweather.service.CityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("api/v1/weather/cities")
    public Page<City> getCitiesByCountry(@RequestParam(name = "country") String country, Pageable pageable) {
        return cityService.getAllCityByCountry(country, pageable);
    }

    @GetMapping("api/v1/weather/cities/all")
    public Page<City> getAllCities(@PageableDefault(direction = Sort.Direction.ASC) Pageable pageable) {
        return cityService.getAllCities(pageable);
    }
}
