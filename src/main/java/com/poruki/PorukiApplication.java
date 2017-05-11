package com.poruki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.poruki.backend.persistance.repositories")
public class PorukiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PorukiApplication.class, args);
	}
}
