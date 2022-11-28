package com.yash.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.yash.security.model.Role;
import com.yash.security.model.User;
import com.yash.security.model.UserRole;
import com.yash.security.service.UserService;

@SpringBootApplication

public class SpringSecurityEmployeeApplication implements CommandLineRunner{

	/*
	 * @Autowired private UserService userService;
	 * 
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 */
    
    public static void main(String[] args) {
        
        SpringApplication.run(SpringSecurityEmployeeApplication.class, args);    
    }
    
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub

       System.out.println("Starting code");
		
		/*
		 * User user=new User(); user.setFirstname("Ravikiran");
		 * user.setLastname("Kapse"); user.setUsername("ravikiran123");
		 * user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
		 * user.setEmail("abc@gmail.com"); user.setProfile("default.png");
		 * user.setPhone("7721888965");
		 * 
		 * Role role1=new Role(); role1.setRoleId(44L); role1.setRoleName("ADMIN");
		 * 
		 * Set<UserRole> userRoleSet=new HashSet<>(); UserRole userRole=new UserRole();
		 * 
		 * userRole.setRole(role1); userRole.setUser(user);
		 * 
		 * userRoleSet.add(userRole);
		 * 
		 * User user1=this.userService.createUser(user, userRoleSet);
		 * System.out.println(user1.getUsername());
		 */
		 
    }
}
    