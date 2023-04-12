package com.customer.foodie_customer.common;

import java.util.List;

import com.customer.foodie_customer.model.Customer;

public class RequiredResponse {

	private Customer customer;
	private List<Restaurant> restaurants;
	
	public RequiredResponse() {
		super();
	}

	public RequiredResponse(Customer customer, List<Restaurant> restaurants) {
		super();
		this.customer = customer;
		this.restaurants = restaurants;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	
	//private Customer name;

	
	
	
//	public Customer getName() {
//		return name;
//	}
//
//	public void setName(Customer name) {
//		this.name = name;
//	}
	
	
	

	}
