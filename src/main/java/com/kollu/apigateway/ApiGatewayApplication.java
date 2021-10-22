package com.kollu.apigateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	private static Logger logger = LoggerFactory.getLogger(ApiGatewayApplication.class);
	
	public static void main(String[] args) {
		System.out.println("Console:: ApiGatewayApplication i am from bank module");
		logger.info("ApiGatewayApplication i am from bank module");
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
