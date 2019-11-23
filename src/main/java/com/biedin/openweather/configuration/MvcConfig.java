package com.biedin.openweather.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Value("${icon.path}")
    private String uploadPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/home/ihor/IdeaProjects/openweather/src/main/resources/icon/**")
                .addResourceLocations("file://" + uploadPath + "/");
        registry.addResourceHandler("/home/ihor/IdeaProjects/openweather/src/main/resources/json/**")
                .addResourceLocations("file://home/ihor/IdeaProjects/openweather/src/main/resources/json/");
    }
}