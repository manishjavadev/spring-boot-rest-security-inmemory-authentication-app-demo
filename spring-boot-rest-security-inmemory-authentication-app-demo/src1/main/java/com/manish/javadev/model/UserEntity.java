package com.manish.javadev.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class UserEntity {
	private static final long serialVersionUID = -2952735933715107252L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String username;

	private String password;

	private boolean enabled;

	private Set<RoleEntity> roles;

	public UserEntity() {
		super();
	}

	public UserEntity(String username, String password, boolean enabled, Set<RoleEntity> roles) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.roles = roles;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", password=" + password + ", enabled=" + enabled
				+ ", roles=" + roles + "]";
	}
}