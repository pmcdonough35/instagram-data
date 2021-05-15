package com.app.instagram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.app.instagram.model.Account;
import com.app.instagram.model.Post;

@SpringBootApplication
public class InstagramApplication {

	private static final Logger log = LoggerFactory.getLogger(InstagramApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(InstagramApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Account quote = restTemplate.getForObject(
					"https://www.instagram.com/instagram/channel/?__a=1", Account.class);
			log.info(quote.toString());
			
			Post post = restTemplate.getForObject(
					"https://www.instagram.com/p/B24tna0FM0I/?__a=1", Post.class);
			log.info(post.toString());
		};
	}
}