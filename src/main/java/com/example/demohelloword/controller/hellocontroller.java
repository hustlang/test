package com.example.demohelloword.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hellocontroller {
    @RequestMapping("initial")
    public String sayHello(){
        return "Hello World";
    }
}
