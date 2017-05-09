package com.poruki.backend.service;

import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService{

	@Override
	public void sendGenericEmailMessage(SimpleMailMessage message) {
		System.out.println(message.toString());	
	}
	
}
