package com.spring.security.api.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.spring.security.api.models.UserAccountRecord;
import com.spring.security.api.repository.UserAccountRecordRepository;
import com.spring.security.api.services.IUserServices;

@Component
public class UserAccountService implements UserDetailsService{

	@Autowired
	private IUserServices repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserAccountRecord user = repository.findByUsername(username);
		
		if(user == null) {
		      throw new UsernameNotFoundException("User not found");
		    }
		List authorities = Arrays.asList(new SimpleGrantedAuthority("user"));
		
		return new User(user.getUsername(), user.getPassword(), authorities);
	}

	

}
