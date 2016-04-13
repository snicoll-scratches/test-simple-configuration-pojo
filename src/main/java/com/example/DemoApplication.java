package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Service
	static class Startup {

		private final AppProperties properties;

		@Autowired
		Startup(AppProperties properties) {
			this.properties = properties;
		}

		@PostConstruct
		public void showMe() {
			System.out.println("The pooling delay is " + this.properties.getPoolingDelay() + "ms");
		}
	}
}
