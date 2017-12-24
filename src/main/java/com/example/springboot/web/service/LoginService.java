package com.example.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		
		return userid.equalsIgnoreCase("biju") &&
					password.equalsIgnoreCase("biju123");
	}
	
}
