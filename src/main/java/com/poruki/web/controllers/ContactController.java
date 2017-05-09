package com.poruki.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poruki.backend.service.EmailService;
import com.poruki.web.domain.frontend.FeedbackPojo;

@Controller
public class ContactController {
	
	public static final String FEEDBACK_MODEL_KEY="feedback";
	private	 static final String CONTACT_US_VIEW_NAME="contact/contact";
	
	@Autowired
	private EmailService emailService;
	
	
	
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public String  contactGet(ModelMap model){
		FeedbackPojo feedbackPojo=new FeedbackPojo();
		model.addAttribute(ContactController.FEEDBACK_MODEL_KEY,feedbackPojo);
		return ContactController.CONTACT_US_VIEW_NAME;
	}
 
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedbackPojo feedback){
		System.out.println(feedback);
		emailService.sendFeedbackEmail(feedback);
		return ContactController.CONTACT_US_VIEW_NAME;
	}
}