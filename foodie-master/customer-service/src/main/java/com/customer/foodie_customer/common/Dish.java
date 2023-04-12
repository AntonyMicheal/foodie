package com.customer.foodie_customer.common;

public class Dish {

	private int id;

	private float price;

	private String description;

	private String dishName;
	
	private String restaurantName;


	private String imageUrl;

	private String type;

	private String availableTime;

	private String availableDay;

	private String isEnabled;
	
	

	public Dish() {
		super();
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



	public void setPrice(float price) {
		this.price = price;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
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



	@Override
	public String toString() {
		return "Dish [id=" + id + ", price=" + price + ", description=" + description + ", dishName=" + dishName
				+ ", restaurantName=" + restaurantName + ", imageUrl=" + imageUrl + ", type=" + type
				+ ", availableTime=" + availableTime + ", availableDay=" + availableDay + ", isEnabled=" + isEnabled
				+ "]";
	}

	
}



