package com.user.service;

import com.user.entity.User;

public class UserServiceImplStub implements IUserService {

	@Override
	public String saveUser(User user) {
		
		return "1";
	}

}
