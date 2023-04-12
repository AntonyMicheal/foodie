package com.ust.foodie.restuarants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.foodie.restuarants.model.Restaurant;
import com.ust.foodie.restuarants.repository.Restaurantrepo;

@Service
class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	Restaurantrepo restaurantRepo;

	@Override
	public Restaurant createRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantRepo.save(restaurant);
		
	}

	@Override
	public Restaurant getRestaurant(int id) {
		// TODO Auto-generated method stub
		return restaurantRepo.findById(id).get();
	}

	@Override
	public List<Restaurant> getEnableRestaurants() {
		// TODO Auto-generated method stub
		return restaurantRepo.findByisApproved("y");
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		return restaurantRepo.findAll();
	}

	@Override
	public String enableRestaurant(int id) {
		// TODO Auto-generated method stub
		try {
			Restaurant rest = restaurantRepo.findById(id).get();
			rest.setIsApproved("y");
			restaurantRepo.save(rest);
		} catch (Exception e) {
			// TODO: handle exception
			return "Id does not exist";
		}
		return "Restaurant Enabled Successfully";
	}

	@Override
	public String disableRestaurant(int id) {
		// TODO Auto-generated method stub
		try {
			Restaurant rest = restaurantRepo.findById(id).get();
			rest.setIsApproved("n");
			restaurantRepo.save(rest);
		} catch (Exception e) {
			// TODO: handle exception
			return "Id does not exist";
		}
		return "Restaurant Disabled Successfully";
	}

	@Override
	public List<Restaurant> getRestaurantsByLocation(String location) {
		// TODO Auto-generated method stub

		return restaurantRepo.findByLocationAndIsApproved(location, "y");
	}

	

	@Override
	public List<Restaurant> getRestaurantsByRating(int rating) {
		// TODO Auto-generated method stub
		return restaurantRepo.findByRatingGreaterThanAndIsApproved(rating, "y");
	}

	@Override
	public List<Restaurant> getRestaurantsByCategory(String category) {
		// TODO Auto-generated method stub
		return restaurantRepo.findByCategoryAndIsApproved(category, "y");
	}
}