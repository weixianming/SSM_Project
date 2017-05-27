package com.ming.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ming.baseTest.SpringTestCase;
import com.ming.domain.User;

public class UserServiceTest extends SpringTestCase {
	
	@Autowired
	private UserService userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void selectUserByIdTest(){
		User user = userService.selectUserById(2);
		logger.debug("查找结果"+user);
	}
}
