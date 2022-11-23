package com.assement.week5.Models;

import java.util.ArrayList;
import java.util.List;

public class Bank{
	
	private String id;
	private String bankName;
	private Double amount;
	private User user;
	private Boolean enable;
	private List<Transaction> transactions;

	public Bank(String id, String bankName, Double amount, User user) {
		this.id = id;
		this.bankName = bankName;
		this.amount = amount;
		this.user = user;
		this.transactions = new ArrayList<>();
		this.enable = true;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		 this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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