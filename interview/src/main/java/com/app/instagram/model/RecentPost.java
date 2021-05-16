package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentPost {
	
	private Edges[] edges;
	
	public RecentPost() {
		
	}

	public Edges[] getEdges() {
		return edges;
	}

	public void setEdges(Edges[] edges) {
		this.edges = edges;
	}

	@Override
	public String toString() {
		return "RecentPost {edges=" + edges + "}";
	}

}

	

