package com.ust.foodieApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FoodieAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodieAppApplication.class, args);
	}

}
