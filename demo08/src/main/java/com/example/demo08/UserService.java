package com.example.demo08;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepo;
	
	public List<User> getAllUser(){
		List<User> users = new ArrayList<User>();
		userRepo.findAll().forEach(User -> users.add(User));
		return users;
	}
	
	public User getUserById(Long id) {
		return userRepo.getByID(id);
	}
	
	public List<User> getUsersByUserName(String username){
		List<User> users = new ArrayList<User>();
		userRepo.findByUsername(username).forEach(User -> users.add(User));
		return users;
	}
	
	public List<User> getUsersByAge(int age){
		List<User> users = new ArrayList<User>();
		userRepo.findByAge(age).forEach(User -> users.add(User));
		return users;
	}
	
	public void saveOrUpdate(User u) {
		userRepo.save(u);
	}
	
	public void deleteUserById(Long id) {
		userRepo.deleteById(id);
	}
	
	public void delteAllUsers() {
		userRepo.deleteAll();
	}
}
