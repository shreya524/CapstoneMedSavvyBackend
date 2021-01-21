package com.webapp.medSavvy.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.medSavvy.entity.User;
import com.webapp.medSavvy.repository.UserRepository;

@Service
public class userservice {

	@Autowired
	private UserRepository repo;
	public User registeruser(User user) {
		return repo.save(user);
		
	} 
	
 	public Optional<User> findById(Long user_id) {
 		return repo.findById(user_id);
 	}
	
	public User findByUsername(String temp_username) {
		return repo.findByUsername(temp_username);
	}
	
	public User findByUsernameAndPassword(String temp_username, String temp_password) {
		return repo.findByUsernameAndPassword(temp_username, temp_password);
	}
	
//	public User findByPassword(User password);
}
