package com.example.demo08;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.slf4j.Slf4j;

@DataJpaTest
@Slf4j
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepo;
	
	@BeforeEach
	void insertTestData() {
		User u = new User();
		u.setUsername("tom");
		userRepo.save(u);
		
		u = new User();
		u.setUsername("alice");
		userRepo.save(u);
		
		u = new User();
		u.setUsername("jane");
		userRepo.save(u);
		
		u = new User();
		u.setUsername("sophia");
		userRepo.save(u);
		
		u = new User();
		u.setUsername("james");
		userRepo.save(u);
		
	}
	
	@Test
	void findAllTest() {
		List<User> userList = userRepo.findAll();
		for(User u : userList) log.info("[FindAll]: " + u.getID() + " / " + u.getUsername());
	}
	
	@Test
	void find2ByNameTest() {
		List<User> userList = userRepo.findFirst2ByUsernameLikeOrderByIDDesc("j%");
		for(User u : userList) log.info("[FindTwo]: " + u.getID() + " / " + u.getUsername());
	}
}
