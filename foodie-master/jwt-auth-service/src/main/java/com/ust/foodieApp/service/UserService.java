package com.ust.foodieApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.ust.foodieApp.dao.UserDao;
import com.ust.foodieApp.entity.User;

@Service
public class UserService {

	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	

	public User registerNewUser(User user) {
		
		user.setPassword(getEncodedPassword(user.getPassword()));
		
		return userDao.save(user);

	}
	
	
	public String getEncodedPassword(String password) {
		
		return passwordEncoder.encode(password);
	}
}
