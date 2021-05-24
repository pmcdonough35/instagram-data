package com.app.instagram.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.instagram.model.Account;
import com.app.instagram.model.Post;
import com.app.instagram.service.InstagramService;
import com.app.instagram.service.InstagramServiceInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InstagramController {
	
	@Autowired
	private InstagramServiceInterface instagramService;
	private static final Logger log = LoggerFactory.getLogger(InstagramController.class);
	
	
	@GetMapping("/api/account/{id}")
	public ResponseEntity<Account> getAccount(@PathVariable String id, @RequestParam String __a) {	
		Account account = instagramService.getAccount(id, __a);
		if (account == null) {
			return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
		}
		log.info(account.toString());
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}
	
	@GetMapping("/api/post/{post-id}")
	public ResponseEntity<Post> getPost(@PathVariable("post-id") String postId, @RequestParam String __a) {
		Post post = instagramService.getPost(postId, __a);
		
		if (post == null) {
			return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
		}
		log.info(post.toString());
		return new ResponseEntity<Post>(post, HttpStatus.OK);
	}
	
	
	
}

