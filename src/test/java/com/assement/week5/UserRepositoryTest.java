package com.assement.week5;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
	

	
	
	@Autowired
	private UserRepository repo;
	
	@Test
	public void CreateUser() {
		Integer users = repo.getUsers().size();
		repo.create(new User("4", "Paola", "Johns", "Norene39", "hola1234"));
		assertTrue(repo.getUsers().size()==users+1);
		
	}
	
	@Test
	public void UpdateUser() {
		User user = repo.findUser("1");
		String username = user.getUserName();
		user.setUsername("cambio");
		repo.updateUser(user.getId(), user);
		assertNotEquals(repo.findUser(user.getId()).getUserName(), username);
		
		
	}
	



}
