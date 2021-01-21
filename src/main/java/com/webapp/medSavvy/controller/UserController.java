package com.webapp.medSavvy.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.webapp.medSavvy.entity.User;
import com.webapp.medSavvy.repository.UserRepository;
import com.webapp.medSavvy.service.userservice;


@RestController
@RequestMapping(path = "/user")
public class UserController {
	@Autowired
	private userservice UserService;

//Login user
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/login-user")
	public String loginuser(@RequestBody User user) throws Exception {

		String temp_username = user.getUsername();
		String temp_password = user.getPassword();

		if ("".equals(temp_username)) {
			throw new Exception("Please enter username");
		} else if ("".equals(temp_password)) {
			throw new Exception("Please enter Password");
		} else {
			User userobj = null;
			userobj = UserService.findByUsernameAndPassword(temp_username, temp_password);
			if (userobj == null) {
				throw new Exception("Invalid credetionals");
			}
		}
		return ("<h1> Your are logged in <h1>");

	}

//Register New user
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/register-user")
	@Transactional
	public User registeruser(@RequestBody User user) throws Exception {
		String temp_username = user.getUsername();
		String temp_password = user.getPassword();
		String temp_firstname = user.getFirstname();
		String temp_lastname = user.getLastname();
		if ("".equals(temp_username)) {
			throw new Exception("Please enter Username");
		} else if ("".equals(temp_password)) {
			throw new Exception("Please enter Password");
		} else if ("".equals(temp_firstname)) {
			throw new Exception("Please enter first name");
		} else if ("".equals(temp_lastname)) {
			throw new Exception("Please enter last name");
		} else {
			User usernobj = UserService.findByUsername(temp_username);
			if (usernobj != null) {
				throw new Exception("Username already exists");
			}
		}
		return UserService.registeruser(user);
	}

}
