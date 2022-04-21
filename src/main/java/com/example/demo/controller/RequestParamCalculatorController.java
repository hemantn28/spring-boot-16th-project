package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamCalculatorController {

    @RequestMapping("/my_addition")
    public String addition4(@RequestParam int a,@RequestParam int b){
        return "addition is "+(a+b);
    }

    @RequestMapping("/my_minus")
    public String subtraction(@RequestParam int a,@RequestParam int b){
        int c=a-b;
        return "subtraction is "+c;
    }

    @RequestMapping("/my_divide")
    public int divide(@RequestParam int a,@RequestParam int b){
        int c=a/b;
        return c;
    }
}
