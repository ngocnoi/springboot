package com.group5.librarymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group5.librarymanagement.Entity.User;
import com.group5.librarymanagement.Service.UserService;
@RestController
@RequestMapping(path = "/api")
public class UserController {
	@Autowired
	private UserService UserServicempl;
	
	@RequestMapping(value = "/users")
	public List<User> getAllUser(){
		return UserServicempl.listAllUser();
		
	}
	@PostMapping("/addUser/new")
	  public User createUser(@RequestBody User user) {
	    return UserServicempl.addUser(user);
	  }
	
	@GetMapping("/existUser/{cardNumber}")
	public User existUsername(@PathVariable final String cardNumber){
		return UserServicempl.existUserName(cardNumber);
		
	}
	
	

}
