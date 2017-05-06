package com.poruki.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18nConfig {

	@Bean 
	public ReloadableResourceBundleMessageSource messageSource(){
		ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource= new ReloadableResourceBundleMessageSource();
		reloadableResourceBundleMessageSource.addBasenames("classpath:i18n/messages");
		// Check new message for every 30 minutes
		reloadableResourceBundleMessageSource.setCacheSeconds(1800);
		return reloadableResourceBundleMessageSource;
	}
}
