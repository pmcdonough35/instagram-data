package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

  private String biography;
  
  public User() {
  }
  
  public String getbiography() {
    return this.biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }
  
  @Override
  public String toString() {
    return "Value{" +
        "bio=" + biography +'\'' +
        '}';
  }
}