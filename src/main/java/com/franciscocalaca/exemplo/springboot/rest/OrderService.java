package com.franciscocalaca.exemplo.springboot.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.franciscocalaca.exemplo.springboot.model.OrderClient;
import com.franciscocalaca.exemplo.springboot.repository.OrderDao;

@RestController
@RequestMapping("/order")
public class OrderService {
   
   @Autowired
   private OrderDao orderDao;

   @RequestMapping(value="/list", method = RequestMethod.GET)
   public List<OrderClient> getClients(){
      List<OrderClient> result = new ArrayList<>();
      orderDao.findAll().forEach(result::add);
      return result;
   }
   
}
