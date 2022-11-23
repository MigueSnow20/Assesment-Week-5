package com.assement.week5.Models;

import java.util.ArrayList;
import java.util.List;

public class User{
	
	private String id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String confirm;
	private String email;
	private Integer phone;
	private List<Bank> accounts;
	
	public User(String id, String firstName, String lastName, String username, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = username+"@gmail.com";
		this.accounts = new ArrayList<>();
		
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
	public List<Bank> getAccounts() {
		return accounts;
	}

	public void setAccount(Bank account) {
		this.accounts.add(account);
	}
}