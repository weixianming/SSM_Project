package com.ming.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
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
	
	@Test
	public void addUser(){
		User u = new User();
		u.setUserName("xianming1");
		u.setUserPassword("123114");
		u.setUserEmail("adasda@da1dsa");
		userService.addUser(u);
	}
	
	@Test
	public void list(){
		List<User> list = userService.listAllUser();
		for(User u:list){
			System.out.println(u.getUserName());
		}
	}
	
	@Test
	public void delete(){
		userService.deleteUser(15);
	}
	
}
