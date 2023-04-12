package com.ust.foodie.restuarants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.foodie.restuarants.model.Dish;
import com.ust.foodie.restuarants.model.DishVO;
import com.ust.foodie.restuarants.model.Restaurant;
import com.ust.foodie.restuarants.service.DishService;

@RestController
@RequestMapping("/restaurants/dish/v1")
public class DishController {

	@Autowired
	DishService service;

	@PostMapping("/save")
	public String CreateDish(@RequestBody DishVO dish) {
		return service.createDish(dish);
	}

	@GetMapping("/getall")
	public List<Dish> getRestaurant() {

		return service.findAll();

	}
	
	@DeleteMapping("/delete/{resId}/{dishId}")
	public String DeleteDish(@PathVariable int resId, @PathVariable int dishId) {

		return service.deleteDish(resId, dishId);

	}
	@DeleteMapping("/delete/{dishId}")
	public String DeleteDishes( @PathVariable int dishId) {

		return service.deleteDishes(dishId);

	}

	@PutMapping("/update")
	public String updateDish(@RequestBody DishVO dish) {

		return service.updateDish(dish);

	}

	@GetMapping("/get/{resId}/{dishId}")
	public Dish getDish(@PathVariable int resId, @PathVariable int dishId) {

		return service.getDish(resId, dishId);

	}
	@GetMapping("/get/{resId}")
	public Restaurant getRestaurantDishes(@PathVariable int resId) {

		return service.getRestaurantDishes(resId);

	}

	@PutMapping("/enabledish/{resId}/{dishId}")
	public String enableDish(@PathVariable int resId, @PathVariable int dishId) {

		return service.enableDish(resId, dishId);

	}

	@PutMapping("/disabledish/{resId}/{dishId}")
	public String disableDish(@PathVariable int resId, @PathVariable int dishId) {

		return service.disableDish(resId, dishId);

	}

}
