package com.user.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.user.entity.User;
//used in production
@Service
public class UserServiceImpl implements IUserService {
//repo
	@Override
	public String saveUser(User user) {
		System.out.println("service called"+ user.getFirstName());
		return null;
	}

	@Override
	public ArrayList<User> getUsers() {
		return new ArrayList<User>();
	}

}
