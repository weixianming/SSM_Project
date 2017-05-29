package com.ming.service;

import java.util.List;

import com.ming.domain.User;

public interface UserService {
	
	User selectUserById(Integer userId);
	
	void addUser(User user);
	
	List<User> listAllUser();
	
	void deleteUser(int userId);
	
}
