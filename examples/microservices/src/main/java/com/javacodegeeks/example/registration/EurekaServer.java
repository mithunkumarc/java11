package com.javacodegeeks.example.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "eureka-server");
		SpringApplication.run(EurekaServer.class, args);
		//first run this file as spring boot app
		//then run main.java as java app
	}
}
