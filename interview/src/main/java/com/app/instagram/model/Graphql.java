package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Graphql {
  private User user;

  public Graphql() {
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "Bio{" +
        "bio='" + user + '\'' +
        '}';
  }
}
