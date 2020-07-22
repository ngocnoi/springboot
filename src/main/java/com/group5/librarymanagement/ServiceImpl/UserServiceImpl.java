package com.group5.librarymanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.librarymanagement.Entity.User;
import com.group5.librarymanagement.Repositories.UserRepository;
import com.group5.librarymanagement.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.saveAndFlush(user);
	}

	@Override
	public void updateUser(Integer id, User user) {
		
		
	}

	@Override
	public List<User> listAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
