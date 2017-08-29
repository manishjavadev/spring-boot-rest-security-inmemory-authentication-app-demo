package com.manish.javadev.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthoritiesContainer;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.manish.javadev.dao.UserDao;
import com.manish.javadev.model.RoleEntity;
import com.manish.javadev.model.UserEntity;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = null;
		User user = new User(userEntity.getUsername(), userEntity.getPassword(), getAuthorities(userEntity));
		return null;
	}

	private Set<GrantedAuthority> getAuthorities(UserEntity user) {
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		for (RoleEntity role : user.getRoles()) {
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRole());
			authorities.add(grantedAuthority);
		}
		return authorities;
	}
}
