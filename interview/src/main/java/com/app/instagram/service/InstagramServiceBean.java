package com.app.instagram.service;

import org.springframework.web.client.RestTemplate;

import com.app.instagram.model.Account;
import com.app.instagram.model.Post;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

@Service
public class InstagramServiceBean implements InstagramServiceInterface {

	private static final String GET_ACCOUNT = "https://www.instagram.com/{id}/channel/?__a={__a}";
	private static final String GET_POST = "https://www.instagram.com/p/{post-id}/?__a={__a}";
	private final RestTemplate restTemplate;
	private static final Logger log = LoggerFactory.getLogger(InstagramServiceBean.class);
	
	public InstagramServiceBean(RestTemplateBuilder restTemlateBuilder) {
		this.restTemplate = restTemlateBuilder.build();
	}
	
	@Override
	public Account getAccount(String id, String __a) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", id);
		params.put("__a", __a);
		Account account = restTemplate.getForObject(
				GET_ACCOUNT, Account.class, params);
		return account;
	}
	
	@Override
	public Post getPost(String postId, String __a) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("post-id", postId);
		params.put("__a", __a);
		Post post = restTemplate.getForObject(
				GET_POST, Post.class, params); 
		log.info("POSTABHDNISOAKD" + post.toString()); 
		return post;
	}
}
	
	
	