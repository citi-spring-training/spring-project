package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface IUserService {
	String saveUser(User user);

	List<User> getUsers();
}
