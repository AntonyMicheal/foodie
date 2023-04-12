package com.ust.foodie.restuarants.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.foodie.restuarants.model.Dish;
import com.ust.foodie.restuarants.model.Restaurant;
import com.ust.foodie.restuarants.repository.DishRepository;
import com.ust.foodie.restuarants.repository.Restaurantrepo;
import com.ust.foodie.restuarants.service.DishService;
import com.ust.foodie.restuarants.service.RestaurantService;

@RestController
@RequestMapping("/restaurants/v1")
public class RestaurantController {

	@Autowired
	Restaurantrepo repo;

	@Autowired
	RestaurantService service;

	@Autowired
	DishService dishService;

	@Autowired
	DishRepository dishRepository;

	@PostMapping("/save")
	public Restaurant CreateRestaurant(@RequestBody Restaurant restaurant) {

		return service.createRestaurant(restaurant);
	}

	@GetMapping("/getall")
	public List<Restaurant> getRestaurant() {

		return repo.findAll();

	}

	@GetMapping("/getallDishes")
	public List<Dish> getDishes() {

		return dishRepository.findAll();

	}

	@DeleteMapping("/delete/{id}")
	public void deleteRestaurant(@PathVariable int id) {
		repo.deleteById(id);
	}

	@PutMapping("/update/{id}")
	public Restaurant updateEmployee(@RequestBody Restaurant restaurant) {
		String n = "no", y="yes";
		Restaurant r = repo.findById(restaurant.getId()).get();
		
		if (r.getIsApproved().equalsIgnoreCase("yes")) {
			System.out.println("inside if");
			r.setIsApproved(n);
			System.out.println("after changing yes to no: "+r.getIsApproved());
			return repo.save(r);
		} else
		 {
			 r.setIsApproved(y);
			 return repo.save(r);
		 }
		
		
		

		
		
//		r.setCategory(restaurant.getCategory());
//		r.setContactNo(restaurant.getContactNo());
//		r.setImageUrl(restaurant.getImageUrl());
//		
//		
//		
//		 r.setIsApproved(restaurant.getIsApproved());
//		r.setLocation(restaurant.getLocation());
//		r.setPassword(restaurant.getPassword());
//		r.setRating(restaurant.getRating());
//		r.setUsername(restaurant.getUsername());
//		r.setDishList(null);
//		return repo.save(r);

	}

	@GetMapping("/get/{id}")
	public Restaurant getRestaurant(@PathVariable int id) {

		return service.getRestaurant(id);

	}

	@GetMapping("/get/approvedRestaurants")
	public List<Restaurant> getEnableRestaurants() {

		return service.getEnableRestaurants();

	}

	@GetMapping("/get/getall")
	public List<Restaurant> getAllRestaurants() {

		return service.getAllRestaurants();

	}

	@PutMapping("/enable/{restId}")
	public String enableRestaurant(@PathVariable int restId) {
		return service.enableRestaurant(restId);
	}

	@PutMapping("/disable/{restId}")
	public String disableRestaurant(@PathVariable int restId) {

		return service.disableRestaurant(restId);

	}

	@GetMapping("/getbylocation/{location}")
	public List<Restaurant> getRestaurantByLocation(@PathVariable String location) {

		return service.getRestaurantsByLocation(location);

	}

	@GetMapping("/getbyrating/{rating}")
	public List<Restaurant> getRestaurantByRating(@PathVariable int rating) {

		return service.getRestaurantsByRating(rating);

	}

	@GetMapping("/getbycategory/{category}")
	public List<Restaurant> getRestaurantByCategory(@PathVariable String category) {

		return service.getRestaurantsByCategory(category);

	}

//	 @PostMapping("/giverating/{resId}/{rating}") public String
//	  giveRatingtoRestaurant(@RequestBody Rating rating) {
//	  
//	  return ratingService.createRating(rating);
//	  
//	  }

//	  @PostMapping("/givefeedback/{resId}/{feeback}") public String
//	  giveFeedbacktoDish(@RequestBody Feedback feedback) {
//	  
//	  return feedbackService.createFeeback(feedback);
//	  
//	  }

//	  @GetMapping("/getratings") public List<Rating> getAllRatings() {
//	  
//	  return ratingService.viewRatings();
//	  
//	  }

//	  @PostMapping("/getfeedbacks") public List<Feedback> getFeedbacks() {
//	  
//	  return feedbackService.viewFeedBacks();
//	  
//	 }

}