package com.example.awsec2.controller;

import com.example.awsec2.AwsEc2Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private final static Logger logger = LoggerFactory.getLogger(MyController.class);
    @GetMapping("/")
    public String welcome(){
        logger.info("Test");
        return "This is Test Spring Boot Project";
    }
    @GetMapping("/call")
    public String call(){
        logger.error("Calling...");
        return "Calling ...";
    }
}
