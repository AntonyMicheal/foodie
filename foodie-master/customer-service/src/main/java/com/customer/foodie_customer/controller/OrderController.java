package com.customer.foodie_customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.foodie_customer.model.Order;

import com.customer.foodie_customer.service.OrderService;

@RestController
@RequestMapping("/customers")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/saveOrder")
	public Order saveOrder(@RequestBody Order order) {
		System.out.println("printing " + order.getDishName());
		return orderService.save(order);

	}
	
	
	
	@GetMapping("/getOrders")
	public List<Order> getAllOrders() {
		return orderService.getAll();

	}

}
