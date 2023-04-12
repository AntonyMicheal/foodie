package com.customer.foodie_customer.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.customer.foodie_customer.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>{

//	@Query(
//			  value = "select * from foodie.customer where location = ?", 
//			  nativeQuery = true)
//	Customer findByLocation(String location);
//	
//	
//	
//	
//	@Query(
//			  value = "select * from foodie.customer where name = ?", 
//			  nativeQuery = true)
//	Customer findByName(String name);
//
//
//
//	@Query(
//			  value = "select * from foodie.customer where dishname = ?", 
//			  nativeQuery = true)
//	Customer findByDishName(String dishName);
//
//
//
//	@Query(
//			  value = "select * from foodie.customer where rating = ?", 
//			  nativeQuery = true)
//	Customer findByRating(String rating);
	

	
}
