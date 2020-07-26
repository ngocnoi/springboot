package com.group5.librarymanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.librarymanagement.Entity.Cart;
import com.group5.librarymanagement.Repositories.CartRepository;
import com.group5.librarymanagement.Service.CartService;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public List<Cart> listCart() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}

	@Override
	public void addCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.saveAndFlush(cart);
	}

	@Override
	public List<Cart> listCartByStatus(Integer status, Integer id) {
		return cartRepository.findAllByStatusAndUser(status, id);
	}

}
