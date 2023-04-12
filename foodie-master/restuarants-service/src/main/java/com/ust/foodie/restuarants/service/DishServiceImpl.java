package com.ust.foodie.restuarants.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ust.foodie.restuarants.model.Dish;
import com.ust.foodie.restuarants.model.DishVO;
import com.ust.foodie.restuarants.model.Restaurant;
import com.ust.foodie.restuarants.repository.DishRepository;
import com.ust.foodie.restuarants.repository.Restaurantrepo;


@Service
public class DishServiceImpl implements DishService {

	@Autowired
	Restaurantrepo restaurantRepo;   
	
	@Autowired
	DishRepository dishRepository;   
	
	
	@Override
	public String createDish(DishVO dish) {

		Restaurant rest = restaurantRepo.findById(dish.getRestaurantId()).get();

		List<Dish> dishLst = new ArrayList<Dish>();
		if (rest.getDishList() != null) {
			dishLst = rest.getDishList();
		}

		Dish dishh = constructDtotoVO(dish);
		dishLst.add(dishh);

		rest.setDishList(dishLst);

		// dishh.setRestaurant(restaurant);

		restaurantRepo.save(rest);
		return "Dish Addedd Successfully";
	}

	@Override
	public List<Dish> findAll() {
		// TODO Auto-generated method stub
		return dishRepository.findAll();
	}
	
	
	private Dish constructDtotoVO(DishVO dish) {
		Dish s=new Dish();
		s.setId(dish.getId());
		s.setPrice(dish.getPrice());
		s.setDescription(dish.getDescription());
		s.setImageUrl(dish.getImageUrl());
		s.setAvailableDay(dish.getAvailableDay());
		s.setAvailableTime(dish.getAvailableTime());
		s.setIsEnabled(dish.getIsEnabled());
		s.setType(dish.getType());
		s.setRestaurantName(dish.getRestaurantName());
		s.setDishName(dish.getDishName());
		
		return s;
	}

	@Override
	public String updateDish(DishVO dish) {
		// TODO Auto-generated method stub
		try {

			Restaurant rest = restaurantRepo.findById(dish.getRestaurantId()).get();

			List<Dish> dishList = rest.getDishList();

			for (Dish dh : dishList) {

				if(dh.getId()==dish.getId()) 
				{
					
						
					dishList.remove(dh);

					dh.setIsEnabled(dish.getIsEnabled());
					dh.setPrice(dish.getPrice());
					dh.setDescription(dish.getDescription());
					dh.setImageUrl(dish.getImageUrl());
					dh.setAvailableDay(dish.getAvailableDay());
					dh.setAvailableTime(dish.getAvailableTime());
					dishList.add(dh);
					rest.setDishList(dishList);
					restaurantRepo.save(rest);
					return "Update successfully";
				}
			}

		} catch (Exception e) {
			// TODO: handle exception

		}

		return "Id not exists";
	}
	/*
	 * @Override public String deleteDish(String id) { // TODO Auto-generated method
	 * stub
	 * 
	 * try { dishRepo.deleteById(id); return "Dish Deleted Successfully"; } catch
	 * (Exception e) { return "Id does not exist"; }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * @Override
	 * 
	 * @Transactional public Dish getDish(String id) { // TODO Auto-generated method
	 * stub
	 * 
	 * Query query = new Query(); query.fields().include("dishList"); List<Dish>
	 * employeeIds = restaurantRepo.find(query , String.class);
	 * 
	 * List<String> employeeIdss=
	 * mongoTemplate.query(Dish.class).distinct("dishList").as(String.class).all();
	 * Dish dish = null; try { dish = restaurantRepo.getClass()
	 * System.out.println(dishRepo.findById(id).get());
	 * 
	 * } catch (Exception e) { // TODO: handle exception
	 * System.out.println("Exception=" + e); } return dish; }
	 * 
	 */
	@Override
	public String deleteDishes(int dishId) {
		dishRepository.deleteById(dishId);
		return "Dish Deleted";
	}

	@Override
	public String deleteDish(int resId, int dishId) {
		// TODO Auto-generated method stub
		try {

			Restaurant rest = restaurantRepo.findById(resId).get();

			List<Dish> dishList = rest.getDishList();

			for (Dish dh : dishList) {

				if (dh.getId()==dishId) {
					dishList.remove(dh);
					restaurantRepo.save(rest);
					return "Deleted successfully";
				}
			}

		} catch (Exception e) {
			// TODO: handle exception

		}

		return "Id not exists";
	}

	@Override
	public Dish getDish(int resId, int dishId) {
		// TODO Auto-generated method stub

		Dish dsh = null;
		try {

			Restaurant rest = restaurantRepo.findById(resId).get();

			List<Dish> dishList = rest.getDishList();

			for (Dish dh : dishList) {

				if (dh.getId()==(dishId)) {
					dsh = dh;
					return dsh;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception

		}

		return dsh;
	}

	@Override
	public String disableDish(int restId, int dishId) {
		// TODO Auto-generated method stub
		try {

			System.out.println("restaurantRepo=" + restId);
			Restaurant rest = restaurantRepo.findById(restId).get();

			System.out.println("restaurantRepo=" + rest);

			List<Dish> dishList = rest.getDishList();

			for (Dish dh : dishList) {

				if (dh.getId()==(dishId)) {
					dh.setIsEnabled("n");
					restaurantRepo.save(rest);
					return "Disabled successfully";
				}
			}

		} catch (Exception e) {
			// TODO: handle exception

		}

		return "Id Does not exist";
	}

	@Override
	public String enableDish(int restId, int dishId) {
		// TODO Auto-generated method stub
		try {

			Restaurant rest = restaurantRepo.findById(restId).get();

			List<Dish> dishList = rest.getDishList();

			for (Dish dh : dishList) {

				if (dh.getId()==dishId) {
					dishList.remove(dh);

					dh.setIsEnabled("y");

					restaurantRepo.save(rest);
					return "Enabled successfully";
				}
			}

		} catch (Exception e) {
			// TODO: handle exception

		}

		return "Id Does not exist";
	}

	@Override
	public Restaurant getRestaurantDishes(int restId) {
				Dish dsh = null;
					Restaurant rest = restaurantRepo.findById(restId).get();

					List<Dish> dishList = rest.getDishList();

//					rest.setDishList(dishList);
//					
//					
//					for (Dish dh : dishList) {
//							dsh = dh;
//							return dsh;
//						}
	
				return rest;
			}

	

	
}
