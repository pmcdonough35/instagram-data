package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Edges {
	
	private Node node;
	
	public Edges() {
		
	}
	
	public Node getNode() {
		return this.node;
	}
	
	public void setnode(Node node) {
		this.node = node;
	}
	
	@Override
	public String toString() {
		return "CommentInfo {numComments=" + node + "}";
	}
	

}
