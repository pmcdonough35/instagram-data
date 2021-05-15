package com.app.instagram.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.instagram.model.Account;
import com.app.instagram.model.Post;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class InstagramController {

	private static final String GET_ACCOUNT = "https://www.instagram.com/{id}/channel/?__a=1";
	private static final String GET_POST = "https://www.instagram.com/p/{post-id}/?__a=1";
	
	static RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/api/account")
	public static Account getAccount() {
		Account account = restTemplate.getForObject(
				"https://www.instagram.com/instagram/channel/?__a=1", Account.class);
		return account;
	}
	
	@GetMapping("/api/post")
	public static Post getPost() {
		Post post = restTemplate.getForObject(
				"https://www.instagram.com/p/B24tna0FM0I/?__a=1", Post.class);  
		return post;
	}
	
	
	
}

