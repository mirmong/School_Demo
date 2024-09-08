package com.example.demo08;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findFirst2ByUsernameLikeOrderByIDDesc(String name);
	
	User getByID(Long id);
	
	List<User> findByUsername(String username);
	
	List<User> findByAge(int age);
}
