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
					"https://www.instagram.com/pmcdonough35/channel/?__a=1", Account.class);
			log.info(quote.toString());
		};
	}
}