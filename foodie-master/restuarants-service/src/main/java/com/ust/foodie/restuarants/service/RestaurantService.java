package com.ust.foodie.restuarants.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ust.foodie.restuarants.model.Restaurant;

public interface RestaurantService {

	public Restaurant createRestaurant(Restaurant restaurant);
	
	public Restaurant getRestaurant(int id);

	public List<Restaurant> getEnableRestaurants();
	
	public List<Restaurant> getAllRestaurants();

	public String enableRestaurant(int id);

	public String disableRestaurant(int id);

	public List<Restaurant> getRestaurantsByLocation(String location);

	public List<Restaurant> getRestaurantsByRating(int rating);

	public List<Restaurant> getRestaurantsByCategory(String category);

}