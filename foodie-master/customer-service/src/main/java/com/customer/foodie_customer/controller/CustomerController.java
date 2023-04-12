package com.customer.foodie_customer.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.foodie_customer.common.Dish;
import com.customer.foodie_customer.common.RequiredResponse;
import com.customer.foodie_customer.common.Restaurant;
import com.customer.foodie_customer.model.Customer;
import com.customer.foodie_customer.model.Order;
import com.customer.foodie_customer.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	private static final String restaurantByLocationUrl = "http://FOODIE-RESTAURANT-SERVICE/restaurants/getRestaurantsByLocation/";
	private static final String restaurantByName = "http://FOODIE-RESTAURANT-SERVICE/restaurants/getRestaurantsByName/";

	private static final String getRestaurantByName = "http://FOODIE-RESTAURANT-SERVICE/restaurants/getRestaurantsByName/";
	private static final String getRestaurantsByDishName ="http://FOODIE-RESTAURANT-SERVICE/restaurants/getRestaurantsByDishName/";
	private static final String getRestaurantsByRating ="http://FOODIE-RESTAURANT-SERVICE/restaurants/getRestaurantsByRating/";
	
	@Autowired
	private CustomerService customerService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		System.out.println("printing " + customer.getName());
		return customerService.save(customer);

	}

	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {

		return customerService.getAllCustomers();
	}

	@DeleteMapping("/deleteCusById/{id}")
	public String deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
		return "customer deleted";
	}

	  @GetMapping("/getAllRestaurant")
		public List<Restaurant> getRestaurant() {
			
	    	HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        HttpEntity <String> entity = new HttpEntity<String>(headers);
	        
	        List<Restaurant> restaurants= restTemplate.exchange("http://FOODIE-RESTAURANT-SERVICE/restaurants/v1/getall", HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Restaurant>>() {}).getBody();
	        
	        return restaurants.stream().filter((res) -> res.getIsApproved().equalsIgnoreCase("YES")).collect(Collectors.toList());
	     }
	  
	  
	  @GetMapping("/getAllDishses")
		public List<Dish> getAllDishes() {
			
	    	HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        HttpEntity <String> entity = new HttpEntity<String>(headers);
	        
	        return restTemplate.exchange("http://FOODIE-RESTAURANT-SERVICE/restaurants/v1/getallDishes", HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Dish>>() {}).getBody();
	     }
		
	
		
	

}
