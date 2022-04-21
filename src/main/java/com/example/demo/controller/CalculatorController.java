package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add")
    public String addition(){
        int a=14;
        int b=15;
        return "addition is "+(a+b);
    }

    @GetMapping("/plus")
    public String addition1(){
        int a=16;
        int b=17;
        int c=a+b;
        return "addition is "+c;
    }

    @GetMapping("/addition")
    public int addition2(){
        int a=18;
        int b=19;
        int c=a+b;
        return c;
    }

    @GetMapping("/minus")
    public String subtract(){
        int a=12;
        int b=11;
        return "subtraction is "+(a-b);
    }

    @GetMapping("/subtract")
    public String subtraction(){
        int a=13;
        int b=10;
        int c=a-b;
        return "minus is "+c;
    }

    @GetMapping("/subtraction")
    public int minus(){
        int a=10;
        int b=8;
        int c=a-b;
        return c;
    }

    @GetMapping("/division")
    public String divide(){
        int a=4;
        int b=2;
        return "division is "+(a/b);
    }

    @GetMapping("/multiplication")
    public String multiply(){
        int a=4;
        int b=7;
        int c=a*b;
        return "multiplication is "+c;
    }

    @GetMapping("/multiply")
    public int multiplication(){
        int a=6;
        int b=3;
        int c=a*b;
        return c;
    }
}
