package com.guru.springframework.springwebapp;

import com.guru.springframework.springwebapp.config.PropertyConfig;
import com.guru.springframework.springwebapp.model.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class SpringwebappApplication {

	@Value("${springwebapp.username}")
	String user;

	@Value("${springwebapp.password}")
	String password;

	@Value("${springwebapp.dburl}")
	String url;


	//jdbc:h2:mem:testdb JDBC URL
	public static void main(String[] args) {
		SpringApplication.run(SpringwebappApplication.class, args);
	}
}
