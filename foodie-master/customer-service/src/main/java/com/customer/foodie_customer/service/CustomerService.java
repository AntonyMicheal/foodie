package com.customer.foodie_customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.foodie_customer.model.Customer;
import com.customer.foodie_customer.model.Order;
import com.customer.foodie_customer.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
    private CustomerRepository cusRepo;

	public Customer save(Customer customer) {
		return cusRepo.save(customer);
	}

	


	public List<Customer> getAllCustomers() {
		
		return cusRepo.findAll();
	}

	public void deleteCustomer(int id) {
		
		 Customer customer = cusRepo.findById(id).get();
		 cusRepo.delete(customer);
		
	}

	/*
	 * public Customer findByLocation(String location) {
	 * 
	 * return cusRepo.findByLocation(location); }
	 * 
	 * public Customer findByName(String name) {
	 * 
	 * 
	 * return cusRepo.findByName(name); }
	 * 
	 * public Customer findByDishName(String dishName) { // TODO Auto-generated
	 * method stub return cusRepo.findByDishName(dishName); }
	 * 
	 * public Customer findByRating(String rating) { // TODO Auto-generated method
	 * stub return cusRepo.findByRating(rating); }
	 */
	
	
	
}
