package com.ming.dao;

import java.util.List;

import com.ming.domain.User;

public interface UserDao {

	public User selectUserById(Integer userId);
	
	public void addUser(User user);
	
	public List<User> listAllUser();
	
	public void deleteUser(int userId);
	
}
