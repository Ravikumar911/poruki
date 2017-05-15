package com.poruki;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poruki.backend.persistance.domain.backend.Role;
import com.poruki.backend.persistance.domain.backend.UserRole;
import com.poruki.backend.persistance.domain.backend.Users;
import com.poruki.backend.service.UserService;
import com.poruki.enums.PlansEnum;
import com.poruki.enums.RolesEnum;
import com.poruki.utils.UserUtils;

@SpringBootApplication

public class PorukiApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(PorukiApplication.class, args);
	}
	
	@Override
	public void run(String... args ) throws Exception {
		
		String username="ravikumar";
		String email="ravikumar@mavjay.com";
				
		System.out.println("Ravi");
		Users user =UserUtils.createBasicUser(username,email);
		Set<UserRole> userRole=new HashSet<>();
		userRole.add(new UserRole(user, new Role(RolesEnum.PRO)));
		userService.createUser(user, PlansEnum.PRO, userRole);
	}
}
