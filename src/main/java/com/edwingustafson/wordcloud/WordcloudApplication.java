package com.edwingustafson.wordcloud;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WordcloudApplication {
	private static final Logger log = LogManager.getLogger(WordcloudApplication.class);

	@Autowired
	WordcloudService service;

	public static void main(final String[] args) {
		SpringApplication.run(WordcloudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(final ApplicationContext applicationContext) {
		return args -> {
			service.run();
		};
	}
}
