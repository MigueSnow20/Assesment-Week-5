package com.assement.week5.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assement.week5.Models.Bank;
import com.assement.week5.Models.User;
import com.assement.week5.Repository.BankRepository;
import com.assement.week5.Repository.UserRepository;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Bank> getAccounts() {
		return bankRepository.getAccounts();
	}
	
	public  List<Bank> getAccountsById(String id) {
		User user = userRepository.findUser(id);
		return bankRepository.getAccountsById(user);
	}

	public Bank createAccount(Bank b, String id) {
		b.setUser(userRepository.findUser(id));
		return bankRepository.createAccount(b);
	}
	
	public List<Bank> deleteAccount(String id) {
		Bank b = bankRepository.getAccountById(id);
		bankRepository.delete(b);
		return bankRepository.getAccountsById(b.getUser());
		
	}
	
	



}