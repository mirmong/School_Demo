package com.example.demo08;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public @ResponseBody String index() {
		return "Hello 8088";
	}
	
	@Autowired
	UserService userServ;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userServ.getAllUser();
	}
	
	@GetMapping("/users/id/{id}")
	public User getUserID(@PathVariable("id") Long id) {
		return userServ.getUserById(id);
	}
	
	@GetMapping("/users/name/{username}")
	public List<User> getUserName(@PathVariable("username") String username){
		return userServ.getUsersByUserName(username);
	}
	
	@GetMapping("/users/age")
	public List<User> getUserAge(@RequestParam("age") int age){
		return userServ.getUsersByAge(age);
	}
	
	@PostMapping("/user")
	public void addUser(@RequestBody User u) {
		userServ.saveOrUpdate(u);
	}
	
	@PutMapping("/user")
	public void updateUser(@RequestBody User u) {
		userServ.saveOrUpdate(u);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userServ.deleteUserById(id);
	}
	
	@DeleteMapping("/users")
	public void deleteUsers() {
		userServ.delteAllUsers();
	}
}
