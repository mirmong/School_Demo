package com.example.demo08;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Demo08Application.class)
class Demo08ApplicationTests {

	@Autowired
	private UserRepository repo;
	
	@BeforeEach
	public void testInsert5() {
		for (int i = 0; i <= 4; i++) {
			User u = User.builder()
					.username("user1"+i)
					.age(10+(i*5))
					.build();
			repo.save(u);
		}
	}
	
//	@BeforeEach
//	public void testInsert10() {
//		for (int i = 0; i<= 9; i++) {
//			User u = new User();
//			u.setUsername("user0"+i);
//			u.setAge(10+(i*7));
//			repo.save(u);
//		}
//	}
	
	@Test
	@DisplayName("모든 사람 검색 테스트")
	void findAllTest() {
		List<User> userList = repo.findAll();
		for(User u : userList)
			System.out.println("[FindAll]: " + u.getID() + " | " + u.getUsername()
														 + " | " + u.getAge());
	}
}
