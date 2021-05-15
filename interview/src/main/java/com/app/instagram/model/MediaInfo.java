package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaInfo {

	@JsonProperty("display_url")
	private String mediaURL;
	
	@JsonProperty("edge_media_preview_like")
	private LikeInfo likeInfo;
	
	@JsonProperty("edge_media_preview_comment")
	private CommentInfo commentInfo;
	
	@JsonProperty("__typename")
	private String postType;
	
	public MediaInfo() {
		
	}

	public String getMediaURL() {
		return mediaURL;
	}

	public void setMediaURL(String mediaURL) {
		this.mediaURL = mediaURL;
	}

	public LikeInfo getLikeInfo() {
		return likeInfo;
	}

	public void setLikeInfo(LikeInfo likeInfo) {
		this.likeInfo = likeInfo;
	}

	public CommentInfo getCommentInfo() {
		return commentInfo;
	}

	public void setCommentInfo(CommentInfo commentInfo) {
		this.commentInfo = commentInfo;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	@Override
	public String toString() {
		return "MediaInfo {mediaURL=" + mediaURL + ", likeInfo=" + likeInfo + ", commentInfo=" + commentInfo
				+ ", postType=" + postType + "}";
	}
	
	
}