package com.biedin.openweather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Main {
    private double temp;
    private double pressure;
    private double humidity;
    @JsonProperty("temp_min")
    private double minTemperature;
    @JsonProperty("temp_max")
    private double maxTemperature;
}
