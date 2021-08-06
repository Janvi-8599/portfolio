package com.spring.security.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.api.services.IUserServices;

@RestController
public class UserAccountController {

	@Autowired
	private IUserServices userService;
	
	@GetMapping(path = "/users")
	public Object getUsers()
	{
		return userService.findall();
	}	
	
	@PostMapping(path = "/users/{name}")
	public Object getUsersByName(@PathVariable("name") String name)
	{
		return userService.findByUsername(name);
	}	
}
