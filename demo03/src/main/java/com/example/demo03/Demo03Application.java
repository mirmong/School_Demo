package com.example.demo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserDto;

@RestController
@SpringBootApplication
public class Demo03Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo03Application.class, args);
	}
	
	@GetMapping(value="/")
	public String HelloLombok() {
		return "Hello Lombok";
	}

	@GetMapping(value="/User01")
	public UserDto testUser01() {
		UserDto user01 = new UserDto();
		user01.setName("Tom");
		user01.setAge(11);
		
		return user01;
	}
}
