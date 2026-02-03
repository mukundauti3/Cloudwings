package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="admin")
public class AdminEntity {

	
	@Id
	@Column(name="phoneno")
	private String phoneNo;
	
	@Column(name="Admin_id")
	private int admin_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String passWord;
	
	
	
	
}
