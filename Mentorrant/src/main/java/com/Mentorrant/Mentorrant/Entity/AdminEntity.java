package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_admin")
public class AdminEntity {
	
	private int adminId;
	private String name;
	private String username;
	private String password;
	private String expertise;
	
	public AdminEntity() {}

	public AdminEntity(int adminId, String name, String username, String password, String expertise) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.username = username;
		this.password = password;
		this.expertise = expertise;
	}
	
	public int getAdminId() {
		return adminId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public String getExpertise() {
		return expertise;
	}
	
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
}
