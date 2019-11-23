//package com.biedin.openweather;
//
//
//import com.biedin.openweather.repository.entity.City;
//import com.biedin.openweather.service.CityService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.stereotype.Component;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class ApplicationListener implements org.springframework.context.ApplicationListener<ApplicationReadyEvent> {
//
//    final
//    CityService cityService;
//    final
//    ObjectMapper objectMapper;
//
//    public ApplicationListener(CityService cityService, ObjectMapper objectMapper) {
//        this.cityService = cityService;
//        this.objectMapper = objectMapper;
//    }
//
//
//    //TODO Uncomment for fill in the database
//    @Override
//    public void onApplicationEvent(ApplicationReadyEvent event) {
////        City[] cities;
////        try {
////            cities = objectMapper.readValue(new File("/home/ihor/IdeaProjects/openweather/src/main/resources/json/city.json"), City[].class);
////            List<City> cityList = Arrays.asList(cities);
////            cityService.saveAllCities(cityList);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//    }
//}
