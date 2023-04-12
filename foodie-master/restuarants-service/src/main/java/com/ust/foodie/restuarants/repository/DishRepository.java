package com.ust.foodie.restuarants.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.foodie.restuarants.model.Dish;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer> {

}
