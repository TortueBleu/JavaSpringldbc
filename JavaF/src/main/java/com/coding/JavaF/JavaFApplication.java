package com.coding.JavaF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.Map;

@SpringBootApplication
public class JavaFApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(JavaFApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);


	}

}