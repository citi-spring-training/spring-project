package com.user.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.user.entity.User;
import com.user.service.UserServiceImplStub;
//@RunWith(JUnitPlatform.class)
//@ExtendWith(SpringExtension.class)
class UserControllerTest {
//	@Autowired
	UserController userController = new UserController();//Arrange
	@Test
	void testSave() {
		userController.service = new UserServiceImplStub();
		User user = new User();
		String id = userController.save(user );//act
		assertEquals("1", id);//assert
	
	}
}
