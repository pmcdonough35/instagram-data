package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Followers {
  
	@JsonProperty("count")
	private Integer followerCount;
	public Followers() {
	  
	}
	public Integer getFollowersCount() {
		return this.followerCount;
	}

	public void setFollowersCount(Followers followers) {
		this.followerCount = followerCount;
	}
  
	@Override
	public String toString() {
		return "Followers {followerCount=" + followerCount + "}";
	}
	}
