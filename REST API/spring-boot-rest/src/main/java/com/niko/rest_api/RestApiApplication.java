package com.niko.rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
	    Dotenv dotenv = Dotenv.load();
	    System.setProperty("DB_NAME", dotenv.get("DB_NAME"));
	    System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
	    System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
	    
		SpringApplication.run(RestApiApplication.class, args);
	}

}
