package com.franciscocalaca.exemplo.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
   
   @Id
   private String id;
   private String name;
   private String category;
   private String deliveryEstimate;
   private int rating;
   private String imagePath;
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getCategory() {
      return category;
   }
   public void setCategory(String category) {
      this.category = category;
   }
   public String getDeliveryEstimate() {
      return deliveryEstimate;
   }
   public void setDeliveryEstimate(String deliveryEstimate) {
      this.deliveryEstimate = deliveryEstimate;
   }
   public int getRating() {
      return rating;
   }
   public void setRating(int rating) {
      this.rating = rating;
   }
   public String getImagePath() {
      return imagePath;
   }
   public void setImagePath(String imagePath) {
      this.imagePath = imagePath;
   }

   
}
