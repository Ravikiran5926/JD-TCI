package com.yash.security.service;

import java.util.Set;

import com.yash.security.model.User;
import com.yash.security.model.UserRole;


public interface UserService {

	//creating user
	public User createUser(User user,Set<UserRole> userRoles) throws Exception;
	
	//getting user
	public User getUser(String username);
	
	//delete user by ID
	public void deleteUser(Long userId);
}
