package com.itbrothers.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
	
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
