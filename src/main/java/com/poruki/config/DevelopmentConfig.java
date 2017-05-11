package com.poruki.config;


import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.poruki.backend.service.EmailService;
import com.poruki.backend.service.MockEmailService;

@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/.poruki/application-dev.properties")
public class DevelopmentConfig {
	@Bean
	public EmailService emailService(){
		return new MockEmailService();
	}
	@Bean
	public ServletRegistrationBean h2ConsoleServletRegistration(){
		ServletRegistrationBean servletRegistrationBean= new ServletRegistrationBean(new WebServlet());
		servletRegistrationBean.addUrlMappings("/console/*");
		return servletRegistrationBean;
	}

}
