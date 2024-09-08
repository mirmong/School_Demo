package com.example.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo02Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo02Application.class, args);
	}

	@GetMapping(value="/helloR")
	public String HelloRest() {
		return "Hello RestController";
	}
}
