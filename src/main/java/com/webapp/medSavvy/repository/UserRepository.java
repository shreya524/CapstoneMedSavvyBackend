package com.webapp.medSavvy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.medSavvy.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUsername(String temp_username);
	public User findByUsernameAndPassword(String temp_username, String temp_password);
}
