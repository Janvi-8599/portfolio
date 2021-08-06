package com.spring.security.api.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.spring.security.api.service.UserAccountService;

@Configuration
@EnableConfigurationProperties
public class RestApiSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	 UserAccountService userDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	 http
	   .csrf().disable()
	   .authorizeRequests().anyRequest().authenticated()
	   .and().httpBasic()
	   .and().sessionManagement().disable();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder builder) 
	throws Exception {
	  builder.userDetailsService(userDetailsService);
	}

	}
