package com.biedin.openweather.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "city")
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
    @Column(name = "id")
    @Id
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
}
