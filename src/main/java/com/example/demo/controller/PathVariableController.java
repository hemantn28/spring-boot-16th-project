package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @GetMapping("/hello/{name}")
    public String message(@PathVariable String name){
        return "Welcome to Path Variable "+name;
    }

    @RequestMapping("/my_city/{city}")
    public String trip(@PathVariable String city){
        return "You are living in "+city;
    }

    @GetMapping("/running/{place}")
    public String question(@PathVariable String place){
        return "Are you going to "+place;
    }

    @GetMapping("/my_age/{age}")
    public String checkAge(@PathVariable int age){
        if (age>=60){
            return "You are senior citizen";
        }
        else if (age>50){
            return "you are old";
        }
        else if (age>40){
            return "You are getting old";
        }
        else if (age>25){
            return "You are an adult";
        }
        else if (age>12){
            return "You are a teenager";
        }
        else{
            return "You are a living being";
        }
    }

    @GetMapping("/the_distance/{distance}")
    public String checkDistance(@PathVariable int distance){
        if (distance>200){
            return "place is very very far";
        }
        else if (distance>100){
            return "place is very far";
        }
        else if (distance>50){
            return "place is near";
        }
        else if (distance>10){
            return "place is very near";
        }
        else{
            return "there exists a place";
        }
    }
}
