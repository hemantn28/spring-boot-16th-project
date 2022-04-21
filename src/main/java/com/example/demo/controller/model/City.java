package com.example.demo.controller.model;

import lombok.Data;

@Data
public class City {

    String name;
    int population;
    String state;

    public City(String name, int population, String state) {
        this.name = name;
        this.population = population;
        this.state = state;
    }
}
