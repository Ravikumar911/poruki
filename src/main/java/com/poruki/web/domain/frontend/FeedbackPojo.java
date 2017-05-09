package com.poruki.web.domain.frontend;

import java.io.Serializable;

public class FeedbackPojo implements Serializable {
	private static final long serialVersionUID=1L;
	
	private String firstName;
	private String lastName;
	private String email;
	private String feedback;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FeedbackPojo [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", feedback=");
		builder.append(feedback);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}