package com.mavrk.interview;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GreetingsController {

	@RequestMapping("/")
	public String index() {
		return "Greetings ssdadfrom Spring Boot!";
	}
}

