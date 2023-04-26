package com.exam.examserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.exam.examserver.service.UserInfoUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public UserDetailsService userDetailsService(){
		
//		UserDetails admin = User.withUsername(null)
		
		return new UserInfoUserDetailsService();
	}

}
