package com.bridgelabz.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//this annotation of combination of three annotation
//1. @EnableAutoConfiguration
//2. @Configuration
//3. @ComponentScan
public class SpringtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtestApplication.class, args);
	}

}
