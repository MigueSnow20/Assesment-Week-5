package com.assement.week5;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.assement.week5.Models.Bank;
import com.assement.week5.Models.User;
import com.assement.week5.Repository.BankRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankControllerTest {

		
		Bank account1;
		User Edgar;
		
		@Autowired
		private BankRepository repo;
		
		@Before
		public void setUp() {
		    Edgar = new User("1", "Edgar", "Johns", "Norene39", "hola1234");
		    account1 = new Bank("qyHvfrT34Nms","Labadie Bank", 98765325.00, Edgar);

		}
		
		@Test
		public void CreateAccount() {
			Integer accounts = repo.getAccountsById(Edgar).size();
			repo.createAccount(account1);
			assertTrue(repo.getAccountsById(Edgar).size()==accounts+1);
			
		}
		
		@Test
		public void deleteAccount() {
			Integer accounts = repo.getAccountsById(Edgar).size();
			repo.delete(repo.getAccountById(account1.getId()));
			assertTrue(repo.getAccountsById(Edgar).size()==accounts-1);
		}
		

		


}
