package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

  private Graphql graphql;
  
  public Account() {
  }
  
  public Graphql getGraphql() {
    return this.graphql;
  }

  public void setGraphql(Graphql graphql) {
    this.graphql = graphql;
  }
  
  @Override
  public String toString() {
    return "Value{" +
        "bio=" + graphql +'\'' +
        '}';
  }
}