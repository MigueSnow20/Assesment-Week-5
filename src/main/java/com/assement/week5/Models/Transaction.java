package com.assement.week5.Models;


public class Transaction{
	
	private User to;
	private Double amount;
	private Bank account;

	public Transaction(User to, Double amount, Bank account) {
		this.account = account;
		this.amount = amount;
		this.to = to;
	}


	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public User getUser() {
		return to;
	}

	public void setUser(User to) {
		this.to = to;
	}
	
	public Bank getAccount() {
		return account;
	}

	public void setAccount(Bank account) {
		this.account = account;
	}
	
}