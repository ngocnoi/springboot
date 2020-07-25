package com.group5.librarymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group5.librarymanagement.Entity.User;
import com.group5.librarymanagement.Service.UserService;
@RestController
@RequestMapping(path = "/api")
public class UserController {
	@Autowired
	private UserService userServicempl;
	
	@RequestMapping(value = "/users")
	public List<User> getAllUser(){
		return userServicempl.listAllUser();
		
	}
	@PostMapping("/addUser/new")
	  public User createUser(@RequestBody User user) {
	    return userServicempl.addUser(user);
	  }
	
	@GetMapping("/existUser/{cardNumber}")
	public ResponseEntity<User> existUsername(@PathVariable final String cardNumber){
		User u = userServicempl.existUserName(cardNumber);
		if (u==null) return ResponseEntity.notFound().build();
		return ResponseEntity.ok(u);
		
	}
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<Void> updateUser(@PathVariable Integer id, @RequestBody User user){
		userServicempl.updateUser(id, user);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
