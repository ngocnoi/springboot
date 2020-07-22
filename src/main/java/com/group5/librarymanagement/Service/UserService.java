package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.User;

public interface UserService {
	public abstract User addUser(User user);
	public abstract void updateUser(Integer id, User user);
	public abstract List<User> listAllUser();  
}
