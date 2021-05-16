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
	
	@JsonProperty("edge_owner_to_timeline_media")
	private RecentPost recentPost;

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Followers getFollowers() {
		return followers;
	}

	public void setFollowers(Followers followers) {
		this.followers = followers;
	}

	public RecentPost getRecentPost() {
		return recentPost;
	}

	public void setRecentPost(RecentPost recentPost) {
		this.recentPost = recentPost;
	}

	@Override
	public String toString() {
		return "User {biography=" + biography + ", fullName=" + fullName + ", followers=" + followers + ", recentPost="
				+ recentPost + "}";
	}
	
	
}