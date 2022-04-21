package com.example.demo.controller;

import com.example.demo.controller.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CarController {

    ArrayList<Car> carArrayList=new ArrayList<>();

    //1. Create => add

    @RequestMapping("/add_car")
    public String add(){
        Car car=new Car("Maruti Suzuki","Swift",550000);
        Car car1=new Car("Honda","Amaze",800000);
        Car car2=new Car("Hyundai","Verna",1100000);

        carArrayList.add(car);
        carArrayList.add(car1);
        carArrayList.add(car2);

        return "car added successfully";
    }

    //2. Read => Get

    @RequestMapping("/get_carlist")
    public ArrayList<Car> getCarArrayList() {
        return carArrayList;
    }

    //3.Update

    @RequestMapping("/update_car")
    public String update(){
        carArrayList.get(0).setName("Volkswagon");
        carArrayList.get(0).setModel("Ameo");
        carArrayList.get(0).setPrice(850000);

        return "cars updated successfully";
    }

    //4.Delete

    @RequestMapping("/delete_car")
    public String delete(){
        carArrayList.remove(2);
        return "car deleted successfully";
    }
}
