package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Node {
	
	private String shortcode;
	
	public Node() {
		
	}

	public String getShortcode() {
		return shortcode;
	}

	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}

	@Override
	public String toString() {
		return "Node {shortcode=" + shortcode + "}";
	}

	
	
	

}
