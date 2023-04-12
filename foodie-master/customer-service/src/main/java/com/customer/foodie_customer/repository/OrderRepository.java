package com.customer.foodie_customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.customer.foodie_customer.model.Order;

public interface OrderRepository extends MongoRepository<Order, Integer> {

}
