package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.IUserService;
import com.user.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController { //receives http requests
	@Autowired //property
	IUserService service;//tight coupling, dependency
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	public UserController(UserServiceImpl userServiceImpl) {
		service = userServiceImpl;
	}
	
	@PostMapping
	String save(@RequestBody User user) {
		return service.saveUser(user);
	}
	@GetMapping
	List<User> getUsers(){
		service.getUsers();
	}
}
