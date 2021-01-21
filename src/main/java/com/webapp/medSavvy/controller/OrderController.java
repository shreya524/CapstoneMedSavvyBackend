package com.webapp.medSavvy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.medSavvy.entity.Order;
import com.webapp.medSavvy.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService Oservice;
	
	@PostMapping("/add-order")
	public Order addorder(@RequestBody Order order) {
		Double temp_ordunitprice = order.getOrdunitprice();
		int temp_ordqty = order.getOrdqty();
		order.setOrdtotalprice(temp_ordqty * temp_ordunitprice);
		order.setOrdstatus("Confirmed");
		return (Oservice.addorder(order));
				
	}
	
	@GetMapping("/getall-orders")
	public List<Order> fetchAllOrder(){
		return (Oservice.fetchAllOrder());
	}

}
