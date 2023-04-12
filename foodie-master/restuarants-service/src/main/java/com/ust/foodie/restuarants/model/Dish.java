package com.ust.foodie.restuarants.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Dish {

	@Id
	@GeneratedValue
	private int id;

	private float price;

	private String description;
	
	private String dishName;

	private String imageUrl;

	private String type;

	private String availableTime;

	private String availableDay;
	
	private String restaurantName;

	private String isEnabled;
	
	

	public Dish() {
		super();
	}

	
	public Dish(int id, float price, String description, String dishName, String imageUrl, String type,
			String availableTime, String availableDay, String restaurantName, String isEnabled) {
		super();
		this.id = id;
		this.price = price;
		this.description = description;
		this.dishName = dishName;
		this.imageUrl = imageUrl;
		this.type = type;
		this.availableTime = availableTime;
		this.availableDay = availableDay;
		this.restaurantName = restaurantName;
		this.isEnabled = isEnabled;
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



	public String getRestaurantName() {
		return restaurantName;
	}



	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}


	public String getDishName() {
		return dishName;
	}


	public void setDishName(String dishName) {
		this.dishName = dishName;
	}


	@Override
	public String toString() {
		return "Dish [id=" + id + ", price=" + price + ", description=" + description + ", dishName=" + dishName
				+ ", imageUrl=" + imageUrl + ", type=" + type + ", availableTime=" + availableTime + ", availableDay="
				+ availableDay + ", restaurantName=" + restaurantName + ", isEnabled=" + isEnabled + "]";
	}
	
	

	

}



