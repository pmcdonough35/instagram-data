package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostInfo {

	@JsonProperty("shortcode_media")
	private MediaInfo mediaInfo;
	
	public PostInfo() {
		
	}
  
	public MediaInfo getMediaInfo() {
		return this.mediaInfo;
	}

	public void setMediaInfo(MediaInfo mediaInfo) {
		this.mediaInfo = mediaInfo;
	}
  
	@Override
	public String toString() {
		return "PostInfo {mediaInfo=" + mediaInfo + "}";
	}
}