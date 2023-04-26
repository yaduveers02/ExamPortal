package com.exam.examserver.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.exam.examserver.entity.User;
import com.exam.examserver.repo.UserRepo;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {

	//UserDetails are available with UserRepo so injecting it
	@Autowired
	private UserRepo userRepo; 
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUserName(username);
//		We can use Optional also which is much safe in case if cannot found any  user it will return null and not give nullPointerException
//		Optional<User> = userRepo.findByUserName(username); 
//		here return type is UserDetails so we need to convert User to userDetails
	
		
		return null;
	}

}
