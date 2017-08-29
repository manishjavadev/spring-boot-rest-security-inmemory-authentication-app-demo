package com.manish.javadev.service;

import java.util.Set;

import org.springframework.security.access.annotation.Secured;

import com.manish.javadev.model.UserEntity;

/**
 * @author Manish
 *
 */
public interface UserService {
	@Secured({ "", "" })
	UserEntity createUser(UserEntity account);

	@Secured({ "", "" })
	UserEntity findUser(Long userId);

	@Secured({ "", "" })
	UserEntity deleteByUserId(Long userId);

	@Secured({ "", "" })
	Set<UserEntity> findAllUser();

}
