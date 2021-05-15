package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	private String biography;
  
	@JsonProperty("full_name")
	private String fullName;
  
	@JsonProperty("edge_followed_by")
	private Followers followers;
	public User() {
	  
	}
  
	public String getBiography() {
		return this.biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
  
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public Followers getFollowers() {
		return this.followers;
	}
	
	public void setFollowers(Followers followers) {
		this.followers = followers;
	}
  
	@Override
	public String toString() {
		return "User {biography=" + biography + ", fullName=" + fullName + ", followers=" + followers + "}";
	}
}