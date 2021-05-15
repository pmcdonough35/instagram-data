package com.app.instagram.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class InstagramController {

	@RequestMapping("/")
	public String index() {
		return "Greetings ssdadfrom Spring Boot!";
	}
}

