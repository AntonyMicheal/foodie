package com.ust.foodie.restuarants.service;

import java.util.List;

import com.ust.foodie.restuarants.model.Dish;
import com.ust.foodie.restuarants.model.DishVO;
import com.ust.foodie.restuarants.model.Restaurant;

public interface DishService {

	public String createDish(DishVO dish);

	public String deleteDish(int resid, int dishId);
	
	public String deleteDishes(int dishId);

	public String updateDish(DishVO dish);

	public Dish getDish(int restId, int dishId);
	
	public Restaurant getRestaurantDishes(int restId);

	public String disableDish(int restId, int dishId);

	public String enableDish(int restId, int dishId);

	public List<Dish> findAll();
}
