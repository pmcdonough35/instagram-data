package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LikeInfo {
	
	@JsonProperty("count")
	private Integer numLikes;
	
	public LikeInfo() {
		
	}
	
	public Integer getNumLikes() {
		return this.numLikes;
	}
	
	public void setNumLikes(Integer numLikes) {
		this.numLikes = numLikes;
	}
	
	@Override
	public String toString() {
		return "LikeInfo {numLikes=" + numLikes + "}";
	}

}