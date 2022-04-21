package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @GetMapping("/request")
    public String request(@RequestParam String name){
        return "Welcome to request param "+name;
    }

    @GetMapping("/trip")
    public String journey(@RequestParam String city){
        return "This monument is adjacent to "+city;
    }

    @GetMapping("/my_marks")
    public String checkMarks(@RequestParam int marks){
        if (marks>90){
            return "You are extraordinary student";
        }
        else if (marks>75){
            return "You got distinction";
        }
        else if (marks>55){
            return "You are brilliant student";
        }
        else{
            return "You are student";
        }
    }

    @GetMapping("/my_salary")
    public String checkSalary(@RequestParam int salary){
        if (salary>100000){
            return "Your package is high";
        }
        else if (salary>80000){
            return "Your package is good";
        }
        else if (salary>60000){
            return "Your package is moderate";
        }
        else{
            return "You are getting slary";
        }
    }


}
