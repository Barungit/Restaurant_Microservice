package com.bprojects.restaurantListing.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bprojects.restaurantListing.entity.Restaurant;

@Repository
public interface RestaurantRepo  extends JpaRepository<Restaurant, Integer>{

}
