package com.example.demo.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String message(){

        return "Hello to this world";

    }

    @GetMapping("/message")
    public String hello(){
        return "Hi, How are you?";
    }

    @GetMapping("/print")
    public int returnInteger(){
        return 33;
    }

    @RequestMapping("/salary")
    public double checkSalary(){
        return 85963.52;
    }




}
