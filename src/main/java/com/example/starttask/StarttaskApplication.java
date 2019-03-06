package com.example.starttask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StarttaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarttaskApplication.class, args);
	}

}
