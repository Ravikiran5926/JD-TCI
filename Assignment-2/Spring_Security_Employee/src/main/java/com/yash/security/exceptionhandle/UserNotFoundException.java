package com.yash.security.exceptionhandle;

public class UserNotFoundException extends Exception {


	public UserNotFoundException(String msg) {
		super("User with this Username is already there in DB !!");
	}
	
}

