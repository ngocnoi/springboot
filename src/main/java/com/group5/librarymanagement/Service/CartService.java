package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.Cart;
import com.group5.librarymanagement.Entity.User;

public interface CartService {
	public abstract List<Cart> listCart();
	public abstract void addCart(Cart cart);
	public abstract List<Cart> listCartByStatusAndUser(Integer status,User user);
}
