package com.example.demo.controller.model;

import lombok.Data;

@Data
public class Car {

    String name;
    String model;
    int price;

    public Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
}
