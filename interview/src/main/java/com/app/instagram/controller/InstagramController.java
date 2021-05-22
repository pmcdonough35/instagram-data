package com.app.instagram.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.instagram.model.Account;
import com.app.instagram.model.Post;
import com.app.instagram.service.InstagramServiceBean;
import com.app.instagram.service.InstagramServiceInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class InstagramController {
	
	@Autowired
	private InstagramServiceInterface instagramService;
	
	private static final String GET_ACCOUNT = "https://www.instagram.com/{id}/channel/?__a={__a}";
	private static final String GET_POST = "https://www.instagram.com/p/{post-id}/?__a={__a}";
	private static String postId = "";
	static RestTemplate restTemplate = new RestTemplate();
	private static final Logger log = LoggerFactory.getLogger(InstagramController.class);
	
	@GetMapping("/api/account/{id}")
	public Account getAccount(@PathVariable String id, @RequestParam String __a) {
		
		Account account = instagramService.getAccount(id, __a);
		//String s = account + p;
		return account;
	}
	
	@GetMapping("/api/post/{post-id}")
	public Post getPost(@PathVariable("post-id") String postId, @RequestParam String __a) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("post-id", postId);
		params.put("__a", __a);
		Post post = restTemplate.getForObject(
				GET_POST, Post.class, params);  
		return post;
	}
	
	
	
}

