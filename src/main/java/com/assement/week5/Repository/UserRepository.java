package com.assement.week5.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.assement.week5.Models.User;

@Repository
public class UserRepository {
	
	List<User> users = new ArrayList<>();
	
	static User user = new User("yQ4t5MXsj87t9", "Edgar", "Johns", "Norene39", "hola1234");
	static User user2 = new User("jl2mHfl34MS2", "Arely", "kertzmann", "arelmann", "arel34");
	static User user3 = new User("jT3NS67K9op1", "Ibrahim", "Dickens", "dickhim", "Ibrdi78");
	
	public List<User> getUsers(){
		return users;
	}
	
	public User findUser(String id) {
		if(user.getId().equals(id)) {
			return user;
		}else if(user2.getId().equals(id)){
			return user2;
		}else if(user3.getId().equals(id)) {
			return user3;
		}
		return new User(null, null, null, null, null);
	}
	
	public User create(User user) {
		users.add(user);
		return user;
	}

	
	

}