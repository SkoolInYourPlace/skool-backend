package com.startup.daddyschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DaddyschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaddyschoolApplication.class, args);
	}
}
