package com.assement.week5.Models;

import java.util.ArrayList;
import java.util.List;

public class Bank{
	
	private String bankName;
	private Double amount;
	private String name;
	private User user;
	private Boolean enable;
	private List<Transaction> transactions;

	public Bank(String bankName, Double amount, User user, String name) {
		this.bankName = bankName;
		this.amount = amount;
		this.user = user;
		this.name = name;	
		this.transactions = new ArrayList<>();
		this.enable = true;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getBankname() {
		return bankName;
	}

	public void setBankname(String bankName) {
		this.bankName = bankName;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransaction(Transaction t) {
		this.transactions.add(t);
	}
	
	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean t) {
		this.enable = t;
	}
	
}