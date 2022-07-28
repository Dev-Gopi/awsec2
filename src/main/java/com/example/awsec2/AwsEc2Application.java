package com.example.awsec2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsEc2Application {
	private final static Logger logger = LoggerFactory.getLogger(AwsEc2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(AwsEc2Application.class, args);
		logger.info("hello");
	}

}
