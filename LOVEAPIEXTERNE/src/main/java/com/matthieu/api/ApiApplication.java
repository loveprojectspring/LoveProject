package com.matthieu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(ApiApplication.class, args);
	}



}
