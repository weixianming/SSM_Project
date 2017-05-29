package com.ming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ming.dao.UserDao;
import com.ming.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public List<User> listAllUser() {
		return userDao.listAllUser();
	}

	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}


}
