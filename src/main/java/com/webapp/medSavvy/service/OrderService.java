package com.webapp.medSavvy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.medSavvy.entity.Order;
import com.webapp.medSavvy.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orepo;
	
	public Order addorder(Order order) {
		return orepo.save(order);
	}
	
	public List<Order> fetchAllOrder() {
		return orepo.findAll();
	}

}
