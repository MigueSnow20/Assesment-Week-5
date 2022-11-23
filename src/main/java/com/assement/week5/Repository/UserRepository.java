package com.assement.week5.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.assement.week5.Models.User;

@Repository
public class UserRepository {
	
	List<User> users = Arrays.asList(new User("1", "Edgar", "Johns", "Norene39", "hola1234"), new User("2", "Arely", "kertzmann", "arelmann", "arel34"), new User("3", "Ibrahim", "Dickens", "dickhim", "Ibrdi78"));
	
	
	public List<User> getUsers(){
		return users;
	}
	
	public User findUser(String id) {
		for(int i = 0; i< users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				return users.get(i);
		}
		}
		return new User(null, null, null, null, null);
	}
	
	public User create(User user) {
		users.add(user);
		return user;
	}

	public User updateUser(String id, User user) {
		User user1 = findUser(id);
		user1.setFirstName(user.getFirstName());
		user1.setLastName(user.getLastName());
		user1.setEmail(user.getEmail());
		user1.setPhone(user.getPhone());
		return user1;
	}
	

}