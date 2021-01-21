package com.webapp.medSavvy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.medSavvy.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
