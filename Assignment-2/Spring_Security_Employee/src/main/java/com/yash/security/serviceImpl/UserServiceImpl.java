package com.yash.security.serviceImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.security.exceptionhandle.UserNotFoundException;
import com.yash.security.model.User;
import com.yash.security.model.UserRole;
import com.yash.security.repository.RoleRepository;
import com.yash.security.repository.UserRepository;
import com.yash.security.service.UserService;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	//creating user
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
		User local=this.userRepository.findByUsername(user.getUsername());
		
		if(local!=null)
		{
			System.out.println("User is already there !");
			throw new UserNotFoundException("User already present !");
		}else {
			//user create
			for(UserRole ur:userRoles)
			{
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local=this.userRepository.save(user);
		}	
		return local;
	}

	@Override
	public User getUser(String username) {
		
		return this.userRepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long userId) {
		
		this.userRepository.deleteById(userId);
	}
}

