package com.example.awsec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
    @GetMapping("/")
    public String welcome(){
        return "This is Test Spring Boot Project";
    }
}
