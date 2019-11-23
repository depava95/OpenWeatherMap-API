package com.biedin.openweather.service;

import com.biedin.openweather.model.WeatherServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherService {

    @Value("${application.weatherapi}")
    private String weatherURL;

    @Value("${application.weatherapi.secretkey}")
    private String secretKey;

    private final RestTemplate restTemplate;

    @Autowired
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherServiceResponse getWeather(String cityName, String lang) {
        return restTemplate.getForObject(getURL(weatherURL, cityName, lang, secretKey), WeatherServiceResponse.class);
    }

    private String getURL(String weatherURL, String cityName, String lang, String secretKey) {
        return String.format(weatherURL, cityName, lang, secretKey);
    }
}