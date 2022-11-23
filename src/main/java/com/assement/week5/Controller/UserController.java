package com.assement.week5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assement.week5.Models.User;
import com.assement.week5.Service.UserService;

@Controller
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	

//	@GetMapping("/user/{id}")
//	public User getUser(@PathVariable("id") String id, Model model) {
//		return userService.getUser(id);
//	}
	
	
	@PostMapping("/signUp")
	public User createUser(User user, Model model) {
		return userService.createUser(user);
	}
	
//	@PutMapping("/user/{id}/update")
//	public User updateUser(@PathVariable("id") String id, User user, Model model) {
//		return userService.updateUser(id, user);
//	}

}