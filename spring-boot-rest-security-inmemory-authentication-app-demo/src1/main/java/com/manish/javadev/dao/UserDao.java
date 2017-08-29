package com.manish.javadev.dao;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import com.manish.javadev.model.UserEntity;

/**
 * @author Manish
 *
 */
@NoRepositoryBean
public interface UserDao extends Repository<UserEntity, Long> {

}
