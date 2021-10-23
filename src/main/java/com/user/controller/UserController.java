package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.IUserService;
import com.user.service.UserServiceImpl;

@RestController
public class UserController { //receives http requests
	@Autowired //property
	IUserService service;//tight coupling, dependency
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	public UserController(UserServiceImpl userServiceImpl) {
		service = userServiceImpl;
	}
	
	@PostMapping("/user")
	String save(@RequestBody User user) {
		return service.saveUser(user);
	}
}
