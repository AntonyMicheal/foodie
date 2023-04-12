package com.ust.foodie.restuarants.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.foodie.restuarants.model.Restaurant;

public interface Restaurantrepo extends JpaRepository<Restaurant, Integer>{

	List<Restaurant> findByisApproved(String isApproved);
	
	List<Restaurant> findByLocationAndIsApproved(String location, String String);

	List<Restaurant> findByRatingGreaterThanAndIsApproved(int graterThan, String String);

	List<Restaurant> findByCategoryAndIsApproved(String category, String String);

}
