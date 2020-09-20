package com.cs.iit.project.sar.models;

import java.util.ArrayList;
import java.util.List;

import javax.json.bind.annotation.JsonbProperty;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	@JsonbProperty("first_name")
	private String firstName;
	@JsonbProperty("last_name")
	private String lastName;
	private String phone;
	private String picture;
	@JsonbProperty("is_active")
	private Boolean active;
	private int aid;
	@JsonbProperty("detail")
	private List<Rating> ratings;
	private List<Rating> driversRating;
	private List<Rating> ridersRating;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String phone, String picture, Boolean isActive) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.picture = picture;
		this.active = isActive;
		this.ratings = new ArrayList<Rating>();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getPicture() {
		return picture;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) { 
		this.lastName = lastName; 
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public List<Rating> getDriversRating() {
		return driversRating;
	}

	public void setDriversRating(List<Rating> driversRating) {
		this.driversRating = driversRating;
	}

	public List<Rating> getRidersRating() {
		return ridersRating;
	}

	public void setRidersRating(List<Rating> ridersRating) {
		this.ridersRating = ridersRating;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", picture=" + picture
				+ ", active=" + active + ", aid=" + aid + "]";
	}

}
