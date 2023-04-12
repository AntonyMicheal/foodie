package com.customer.foodie_customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.foodie_customer.model.Order;
import com.customer.foodie_customer.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
    private OrderRepository orderRepository;
	
	public Order save(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}
	
	
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}
}
