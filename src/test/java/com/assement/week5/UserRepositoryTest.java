package com.assement.week5;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.assement.week5.Models.User;
import com.assement.week5.Repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	
	User Edgar;
	
	@Autowired
	private UserRepository repo;
	
	@Before
	public void setUp() {
	    Edgar = new User("yQ4t5MXsj87t9", "Edgar", "Johns", "Norene39", "hola1234");
	}
	
	@Test
	public void CreateUser() {
		Integer users = repo.getUsers().size();
		repo.create(Edgar);
		assertTrue(repo.getUsers().size()==users+1);
		
	}
	
	



}
