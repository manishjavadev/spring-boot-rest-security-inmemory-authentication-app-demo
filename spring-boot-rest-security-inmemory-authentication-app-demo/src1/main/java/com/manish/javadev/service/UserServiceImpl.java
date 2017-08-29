package com.manish.javadev.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.javadev.dao.UserDao;
import com.manish.javadev.model.UserEntity;

/**
 * @author Manish
 *
 */
@Service("accountService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public UserEntity createUser(UserEntity account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity findUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity deleteByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<UserEntity> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
