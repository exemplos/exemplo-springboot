package com.franciscocalaca.exemplo.springboot.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.franciscocalaca.exemplo.springboot.model.Restaurant;
import com.franciscocalaca.exemplo.springboot.repository.RestaurantDao;

@RestController
@RequestMapping("/restaurant")
public class RestaurantService {
   
   @Autowired
   private RestaurantDao restaurantDao;

   @CrossOrigin
   @RequestMapping(method = RequestMethod.GET)
   public List<Restaurant> getRestaurants(){
      List<Restaurant> result = new ArrayList<>();
      restaurantDao.findAll().forEach(result::add);
      return result;
   }
   
   @CrossOrigin
   @RequestMapping(value="/{id}", method = RequestMethod.GET)
   public Restaurant getRestaurant(@PathVariable String id){
      return restaurantDao.findOne(id);
   }
   
}
