package com.ust.foodie.restuarants.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String category;
	private String location;
	private String imageUrl;
	private String contactNo;
	private String isApproved;
	private int rating;
	private String username;
	private String password;
	
	@OneToMany(targetEntity = Dish.class,cascade = CascadeType.ALL)
	@JoinColumn(name="resid_dish",referencedColumnName = "id")
	private List<Dish> dishList;
	
	public Restaurant() {
		super();
	}
	
	

	public Restaurant(int id, String name, String category, String location, String imageUrl, String contactNo,
			String isApproved, int rating, String username, String password, List<Dish> dishList) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.location = location;
		this.imageUrl = imageUrl;
		this.contactNo = contactNo;
		this.isApproved = isApproved;
		this.rating = rating;
		this.username = username;
		this.password = password;
		this.dishList = dishList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<Dish> getDishList() {
		return dishList;
	}

	public void setDishList(List<Dish> dishList) {
		this.dishList = dishList;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}