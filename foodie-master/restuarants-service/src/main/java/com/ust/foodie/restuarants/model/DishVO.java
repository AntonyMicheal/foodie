package com.ust.foodie.restuarants.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class DishVO {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	private float price;

	private String description;

	private String imageUrl;

	private String type;

	private String availableTime;

	private String availableDay;

	private String isEnabled;

	private int restaurantId;
	
	private String dishName;
	 private String restaurantName;

	public DishVO() {
		super();
	}

	

	public DishVO(int id, float price, String description, String imageUrl, String type, String availableTime,
			String availableDay, String isEnabled, int restaurantId, String dishName, String restaurantName) {
		super();
		this.id = id;
		this.price = price;
		this.description = description;
		this.imageUrl = imageUrl;
		this.type = type;
		this.availableTime = availableTime;
		this.availableDay = availableDay;
		this.isEnabled = isEnabled;
		this.restaurantId = restaurantId;
		this.dishName = dishName;
		this.restaurantName = restaurantName;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public String getDishName() {
		return dishName;
	}



	public void setDishName(String dishName) {
		this.dishName = dishName;
	}



	public String getRestaurantName() {
		return restaurantName;
	}



	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}



	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}

	public String getAvailableDay() {
		return availableDay;
	}

	public void setAvailableDay(String availableDay) {
		this.availableDay = availableDay;
	}

	public String getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	
}
