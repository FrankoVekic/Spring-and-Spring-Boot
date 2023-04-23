package com.springboot.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("Franko");
		boolean isValidPassword = password.equalsIgnoreCase("test");
		return isValidUserName && isValidPassword;
	}

}
