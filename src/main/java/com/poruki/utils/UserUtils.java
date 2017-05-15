package com.poruki.utils;

import com.poruki.backend.persistance.domain.backend.Users;

public class UserUtils {
	
	private UserUtils(){
		throw new AssertionError("This class is not instantiable");
	}
	
	public static Users createBasicUser(){
		Users user = new Users();
        user.setUsername("basicUser");
        user.setPassword("secret");
        user.setEmail("ravikumar@mavjay.com");
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setPhoneNumber("123456789123");
        user.setCountry("GB");
        user.setEnabled(true);
        user.setDescription("A basic user");
        user.setProfileImageUrl("https://blabla.images.com/basicuser");
        return user;
		
	}

}
