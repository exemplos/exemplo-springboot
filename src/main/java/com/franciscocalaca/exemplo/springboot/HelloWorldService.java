package com.franciscocalaca.exemplo.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/hello")
@Api(value="Examples",  description="Show some examples about springboot")
public class HelloWorldService {
   
   @Autowired
   private PersonDao personDao;

   @RequestMapping(value="/world", method = RequestMethod.GET)
   public String hello(){
      return "world";
   }
   

   @ApiOperation(value = "List all persons", response = List.class)
   @RequestMapping(value="/persons", method = RequestMethod.GET)
   public List<Person> getPersons(){
      List<Person> result = new ArrayList<>();
      personDao.findAll().forEach(result::add);
      return result;
   }
   
   @RequestMapping(value="/persons", method = RequestMethod.POST)
   public void addPerson(@RequestBody Person p){
      personDao.save(p);
   }
   
   @RequestMapping(value="/persons/{id}", method = RequestMethod.DELETE)
   public void deletePerson(@PathVariable int id){
      personDao.delete(id);
   }
   
}
