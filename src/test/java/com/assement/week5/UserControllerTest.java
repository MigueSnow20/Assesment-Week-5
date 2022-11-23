package com.assement.week5;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.assement.week5.Controller.UserController;
import com.assement.week5.Models.User;

@SpringBootTest
public class UserControllerTest {
	
	User user = new User("yQ4t5MXsj87t9", "Edgar", "Johns", "Norene39", "hola1234", "norene39@gmail.com", 657483261);
	
     UserController s = new UserController();

	@Test
	public void getUser() {
		User user1 = s.getUser();
		assertTrue(user.equals(user1));
		
		
	}
	
	



}
