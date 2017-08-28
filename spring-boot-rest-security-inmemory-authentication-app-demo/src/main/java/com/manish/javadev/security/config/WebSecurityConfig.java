package com.manish.javadev.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/api/account/findaccountbyuser/**")
				.hasAnyRole("USER", "ADMIN").and().formLogin();
		http.authorizeRequests().antMatchers("/api/account/findaccountbyadmin/**").hasAnyRole("ADMIN")
				.and().formLogin();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("manish").password("P@ssw0rd").roles("USER");
		auth.inMemoryAuthentication().withUser("veena").password("P@ssw0rd").roles("ADMIN", "USER");
	}
}
