package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentInfo {
	
	@JsonProperty("count")
	private Integer numComments;
	
	public CommentInfo() {
		
	}
	
	public Integer getNumComments() {
		return this.numComments;
	}
	
	public void setNumComments(Integer numComments) {
		this.numComments = numComments;
	}
	
	@Override
	public String toString() {
		return "CommentInfo {numComments=" + numComments + "}";
	}
	

}
