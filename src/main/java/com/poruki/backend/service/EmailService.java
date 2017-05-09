package com.poruki.backend.service;

import org.springframework.mail.SimpleMailMessage;

import com.poruki.web.domain.frontend.FeedbackPojo;

public interface EmailService {
	public void sendFeedbackEmail(FeedbackPojo feedbackpojo);
	public void sendGenericEmailMessage(SimpleMailMessage message);

}
