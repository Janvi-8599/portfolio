package com.spring.security.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.api.models.UserAccountRecord;
import com.spring.security.api.repository.UserAccountRecordRepository;
import com.spring.security.api.services.IUserServices;

@Service
public class UserService implements IUserServices {

	@Autowired
	private UserAccountRecordRepository userRepo;
	
	@Override
	public List<UserAccountRecord> findall() {
		return userRepo.findAll();
		
	}

	@Override
	public UserAccountRecord findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

}
