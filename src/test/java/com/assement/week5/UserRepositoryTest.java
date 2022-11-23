package com.assement.week5;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.assement.week5.Controller.UserController;
import com.assement.week5.Models.User;
import com.assement.week5.Repository.UserRepository;

@SpringBootTest
public class UserRepositoryTest {
	
	User user = new User("yQ4t5MXsj87t9", "Edgar", "Johns", "Norene39", "hola1234");
	@Autowired
	private UserRepository repo;
	
	@Test
	public void CreateUser() {
		Integer users = repo.getUsers().size();
		repo.create(user);
		assertTrue(users.compareTo(repo.getUsers().size())>0);
		
	}
	
	



}