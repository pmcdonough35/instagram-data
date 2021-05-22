package com.app.instagram.service;

import com.app.instagram.model.Account;
import com.app.instagram.model.Post;

public interface InstagramServiceInterface {
	
	public Account getAccount(String id, String __a);
	
	public Post getPost(String postId, String __a);
	
}
