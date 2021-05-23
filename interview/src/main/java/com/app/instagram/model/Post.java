package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {

	@JsonProperty("graphql")
	private PostInfo postInfo;
	
	public Post() {
		
	}
  
	public PostInfo getPostInfo() {
		return this.postInfo;
	}

	public void setPostInfo(PostInfo postInfo) {
		this.postInfo = postInfo;
	}
  
	@Override
	public String toString() {
		return "Post {postInfo=" + postInfo + "}";
	}
}