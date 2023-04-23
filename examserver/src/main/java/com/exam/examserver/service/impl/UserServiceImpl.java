package com.exam.examserver.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examserver.entity.User;
import com.exam.examserver.entity.UserRole;
import com.exam.examserver.repo.RoleRepo;
import com.exam.examserver.repo.UserRepo;
import com.exam.examserver.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RoleRepo roleRepo;
	
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User tempUser = this.userRepo.findByUserName(user.getUserName());
		if(tempUser!=null) {
			System.out.println("User Already Exists");
			throw new Exception("User Already Present");
		}else {
			// Create user
			for(UserRole ur: userRoles) {
				roleRepo.save(ur.getRole());
			}
			
			user.getUserRoles().addAll(userRoles);
			tempUser = this.userRepo.save(user);
		}
		return tempUser;
	}


	@Override
	public User getUser(String userName) {
		return this.userRepo.findByUserName(userName);
	}

}
