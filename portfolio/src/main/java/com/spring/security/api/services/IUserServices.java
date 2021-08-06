package com.spring.security.api.services;

import java.util.List;

import com.spring.security.api.models.UserAccountRecord;

public interface IUserServices {
	List<UserAccountRecord>findall();

	UserAccountRecord findByUsername(String username);
}
