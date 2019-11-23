package com.biedin.openweather.controller;

import com.biedin.openweather.model.GetWeatherRequest;
import com.biedin.openweather.model.WeatherServiceResponse;
import com.biedin.openweather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("api/v1/weather")
    public WeatherServiceResponse setCity(@RequestParam String city, @RequestParam String lang) {
        GetWeatherRequest request = new GetWeatherRequest(city, lang);
        return weatherService.getWeather(request.getCity(), request.getLang());
    }
}
