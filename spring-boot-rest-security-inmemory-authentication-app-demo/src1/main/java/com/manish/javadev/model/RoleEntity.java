package com.manish.javadev.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Manish
 *
 */
@Entity
@Table(name = "ACCOUNT")
public class RoleEntity {

	private static final long serialVersionUID = -2952735933715107252L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String role;

	@ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
	private Set<UserEntity> users;

	public RoleEntity() {
		super();
	}

	public RoleEntity(String role, Set<UserEntity> users) {
		super();
		this.role = role;
		this.users = users;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(Set<UserEntity> users) {
		this.users = users;
	}

}