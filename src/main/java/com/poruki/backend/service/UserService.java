package com.poruki.backend.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poruki.backend.persistance.domain.backend.Plan;
import com.poruki.backend.persistance.domain.backend.UserRole;
import com.poruki.backend.persistance.domain.backend.Users;
import com.poruki.backend.persistance.repositories.PlanRepository;
import com.poruki.backend.persistance.repositories.RoleRepository;
import com.poruki.backend.persistance.repositories.UserRepository;
import com.poruki.enums.PlansEnum;

@Service
@Transactional(readOnly =true)
public class UserService {
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private PlanRepository planRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public Users createUser(Users user,PlansEnum plansEnum,Set<UserRole> userRoles){
		Plan plan= new Plan(plansEnum);
		
		if(!planRepository.exists(plansEnum.getId())){
			plan=planRepository.save(plan);
		}
		user.setPlan(plan);
		
		for(UserRole ur:userRoles){
			roleRepository.save(ur.getRole());
		}
		
		user.getUserRoles().addAll(userRoles);
		user = userRepository.save(user);
		return user;
	}
}
