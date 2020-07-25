package com.group5.librarymanagement.ServiceImpl;

import java.util.List;
import java.util.Optional;

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
//		User createUser = new User();
//		createUser.setFullname(user.getFullname());
//		createUser.setAddress(user.getAddress());
//		createUser.setPhone(user.getPhone());
//		createUser.setMail(user.getMail());
//		createUser.setCardNumber(user.getCardNumber());
//		createUser.setStatus(user.isStatus());
		return userRepository.save(user);
		//return userRepository.saveAndFlush(user);
	}

	@Override
	public void updateUser(Integer id, User user) {
		User userTemp = userRepository.findById(id).get();
		if(userTemp != null) {
			userTemp.setPhone(user.getPhone());
			userTemp.setAddress(user.getAddress());
		}
		userRepository.saveAndFlush(userTemp);
	}

	@Override
	public List<User> listAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User existUserName(String cardNumber) {
		Optional<User> optionalUser = userRepository.findFirstByCardNumber(cardNumber);
		if (optionalUser.isPresent()) return optionalUser.get();
		return null;
	}

	@Override
	public User AllUserByCardNumber(String cardNumber) {
		// TODO Auto-generated method stub
		return userRepository.findAllByCardNumber(cardNumber);
	}
	
	


}
