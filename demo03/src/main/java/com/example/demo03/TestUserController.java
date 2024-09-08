package com.example.demo03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserDto;

@RestController
public class TestUserController {

	@GetMapping(value="/User02")
	public UserDto testUser02() {
		UserDto user02 = new UserDto();
		user02.setName("Jane");
		user02.setAge(22);
		
		return user02;
	}
}
