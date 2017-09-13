package com.subhash.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootServingWebApplication {

	//http://localhost:9080/greeting?name=User
	public static void main(String[] args) {
		SpringApplication.run(SpringBootServingWebApplication.class, args);
	}
}
