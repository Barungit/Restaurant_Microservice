package com.bprojects.restaurantListing.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bprojects.restaurantListing.dao.RestaurantDTO;
import com.bprojects.restaurantListing.entity.Restaurant;
import com.bprojects.restaurantListing.mapper.RestaurantMapper;
import com.bprojects.restaurantListing.repo.RestaurantRepo;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepo restaurantRepo;

	public List<RestaurantDTO> findAllRestaurants() {
		List<Restaurant> restaurants = restaurantRepo.findAll();
		List<RestaurantDTO> restaurantDtolist = restaurants.stream().map(restaurant -> RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant)).collect(Collectors.toList());
		return restaurantDtolist;
	}
}
