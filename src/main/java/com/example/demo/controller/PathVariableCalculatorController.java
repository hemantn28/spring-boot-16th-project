package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableCalculatorController {

    @GetMapping("/add/{a}/{b}")
    public String addition(@PathVariable int a,@PathVariable int b){
        return "addition is "+(a+b);

    }

    @RequestMapping("/plus/{a}/{b}")
    public String addition2(@PathVariable int a,@PathVariable int b){
        int c=a+b;
        return "addition is "+c;
    }

    @RequestMapping("/addition/{a}/{b}")
    public int addition3(@PathVariable int a,@PathVariable int b){
        int c=a+b;
        return c;
    }

    @RequestMapping("/subtract/{a}/{b}")
    public String subtraction(@PathVariable int a,@PathVariable int b){
        return "subtraction is "+(a-b);
    }

    @GetMapping("/minus/{a}/{b}")
    public int subtract(@PathVariable int a,@PathVariable int b){
        int c=a-b;
        return c;
    }
}
