package com.assement.week5.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assement.week5.Models.Bank;
import com.assement.week5.Models.User;
import com.assement.week5.Repository.UserRepository;

@Repository
public class BankRepository {
	
	@Autowired
	private UserRepository userRepository;
	
	List<Bank> accounts;
	
	public BankRepository(UserRepository userRepository) {
		super();
		this.accounts = new ArrayList<>(Arrays.asList(
				new Bank("qyHvfrT34Nms","Labadie Bank", 1168.00, userRepository.users.get(0)), 
				new Bank("hty23kd3Jm7S","BBVA", 45321.00, userRepository.users.get(0)), 
				new Bank("pt45L2S34mnA","Imagin", 96784.00, userRepository.users.get(1))
		));
	}

	
	public List<Bank> getAccounts(){
		return accounts;
	}

	public List<Bank> getAccountsById(User d) {
		List<Bank> acc = new ArrayList<>();
		for(int i = 0; i<accounts.size(); i++) {
			User s = accounts.get(i).getUser();
			if(s.getId().equals(d.getId()) && accounts.get(i).getEnable().booleanValue() == true) {
				acc.add(accounts.get(i));
			}
		}
		return acc;
	}

	public Bank createAccount(Bank account12) {
		accounts.add(account12);
		return account12;
		
	}

	public void delete(Bank t) {
		try {
			accounts.remove(t);
			t.setEnable(false);
			accounts.add(t);
		}catch(Exception e) {
		}
	}

	public Bank getAccountById(String id) {
		Bank b = new Bank(null, null, null, null);
		for(int i = 0; i<accounts.size(); i++) {
			if(accounts.get(i).getId().equals(id) && accounts.get(i).getEnable().booleanValue() == true) {
				b = accounts.get(i);
			}
		}
		return b;
	}
	
	
	


	
}