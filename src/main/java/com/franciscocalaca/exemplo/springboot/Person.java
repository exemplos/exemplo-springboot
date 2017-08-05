package com.franciscocalaca.exemplo.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer id;
   
   private String name;
   
   private String phone;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public Integer getId() {
      return id;
   }
   
}
