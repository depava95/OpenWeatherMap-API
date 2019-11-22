package com.biedin.openweather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherParams {
    private List<Weather> weather;
    private Main main;
    private Wind wind;
}
