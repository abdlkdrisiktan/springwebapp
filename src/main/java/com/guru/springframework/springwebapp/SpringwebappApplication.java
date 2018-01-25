package com.guru.springframework.springwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwebappApplication {

	//jdbc:h2:mem:testdb JDBC URL
	public static void main(String[] args) {
		SpringApplication.run(SpringwebappApplication.class, args);
	}
}
