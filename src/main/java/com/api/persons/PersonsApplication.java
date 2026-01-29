package com.api.persons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonsApplication {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication.run(PersonsApplication.class, args);
	}

}
