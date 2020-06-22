package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/news")
    public String helloWorldString(){
        return "Hello Foodie, Welcome to Jordan's Resturaunt Page!";
    }
}