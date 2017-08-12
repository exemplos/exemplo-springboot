package com.franciscocalaca.exemplo.springboot.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.franciscocalaca.exemplo.springboot.model.Client;
import com.franciscocalaca.exemplo.springboot.repository.ClientDao;

@RestController
@RequestMapping("/client")
public class ClientService {
   
   @Autowired
   private ClientDao clientDao;

   @RequestMapping(value="/list", method = RequestMethod.GET)
   public List<Client> getClients(){
      List<Client> result = new ArrayList<>();
      clientDao.findAll().forEach(result::add);
      return result;
   }
   
}
