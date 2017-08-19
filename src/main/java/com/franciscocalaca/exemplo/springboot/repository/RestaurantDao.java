package com.franciscocalaca.exemplo.springboot.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.franciscocalaca.exemplo.springboot.model.Restaurant;

@RepositoryRestResource(collectionResourceRel = "dao.restaurant", path = "dao.restaurants")
public interface RestaurantDao extends PagingAndSortingRepository<Restaurant, String>{

}
