package com.exam.examserver.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.exam.examserver.entity.User;
import com.exam.examserver.entity.UserRole;



public class UserInfoUserDetails implements UserDetails{

	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;
	
	
	
	public UserInfoUserDetails(User user) {
		userName = user.getUserName();
		password = user.getPassword();
//		authorities = user.getUserRoles();
 	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
