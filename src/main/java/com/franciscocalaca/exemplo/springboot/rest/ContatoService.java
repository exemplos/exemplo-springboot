package com.franciscocalaca.exemplo.springboot.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.franciscocalaca.exemplo.springboot.model.Contato;
import com.franciscocalaca.exemplo.springboot.repository.ContatoDao;

@RestController
@RequestMapping("/contato")
public class ContatoService {
   
   @Autowired
   private ContatoDao contatoDao;

   @CrossOrigin
   @RequestMapping(method = RequestMethod.GET)
   public List<Contato> getContatos(){
      List<Contato> result = new ArrayList<>();
      contatoDao.findAll().forEach(result::add);
      return result;
   }
   
   @CrossOrigin
   @RequestMapping(value="/{id}", method = RequestMethod.GET)
   public Contato getContato(@PathVariable int id){
      return contatoDao.findOne(id);
   }
   
   @CrossOrigin
   @RequestMapping(method = RequestMethod.POST)
   public void save(@RequestBody Contato c){
      contatoDao.save(c);
   }
   
   @CrossOrigin
   @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
   public void delete(@PathVariable int id){
      contatoDao.delete(id);
   }
   
}
