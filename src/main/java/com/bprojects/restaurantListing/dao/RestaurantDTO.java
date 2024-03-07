package com.bprojects.restaurantListing.dao;

import com.bprojects.restaurantListing.entity.Restaurant;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {
	
	
	private int id;
	private String name;
	private String address;
	private String city;
	private String restaurantDescription;

}