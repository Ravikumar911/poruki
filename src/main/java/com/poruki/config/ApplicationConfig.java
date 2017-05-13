package com.poruki.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages="com.poruki.backend.persistance.repositories")
@EntityScan(basePackages="com.poruki.backend.persistance.domain.backend")
@EnableTransactionManagement
public class ApplicationConfig {
	

}
