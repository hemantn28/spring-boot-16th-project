package com.example.demo.controller;


import com.example.demo.controller.model.City;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CityController {

    ArrayList<City> cityArrayList=new ArrayList<>();

    // 1. Create => add

    @RequestMapping("/add_cities")
    public String add(){
        City city=new City("Agra",1500000,"U.P");
        City city1=new City("Jaipur",2000000,"Rajasthan");
        City city2=new City("Chennai",2500000,"TamilNadu");
        City city3=new City("Pune",1800000,"Maharashtra");
        City city4=new City("Bhopal",1700000,"Madhya Pradesh");

        cityArrayList.add(city);
        cityArrayList.add(city1);
        cityArrayList.add(city2);
        cityArrayList.add(city3);
        cityArrayList.add(city4);

        return "cities added successfully";
    }

    //2.Read => Get

    @RequestMapping("/get_citylist")
    public ArrayList<City> getCityArrayList() {
        return cityArrayList;
    }


    //3.Update

    @RequestMapping("/update_city")
    public String update(){
        cityArrayList.get(2).setName("Ranchi");
        cityArrayList.get(2).setPopulation(1750000);
        cityArrayList.get(2).setState("Bihar");

        return "name updated successfully";

    }

    //4. Delete

    @RequestMapping("/delete_city")
    public String delete(){
        cityArrayList.remove(1);
        return "city deleted successfully";
    }


}
