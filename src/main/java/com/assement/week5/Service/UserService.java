package com.assement.week5.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assement.week5.Models.User;
import com.assement.week5.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public User getUser(String id) {
		return userRepository.findUser(id);
	}
	
	public User createUser(User user) {
		return userRepository.create(user);
	}
//
//	public User updateUser(String id, User user) {
//		return userRepository.updateUser(id, user);
//	}
//	
	

}