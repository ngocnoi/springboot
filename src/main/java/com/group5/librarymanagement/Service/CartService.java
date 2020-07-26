package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.Cart;

public interface CartService {
	public abstract List<Cart> listCart();
	public abstract void addCart(Cart cart);
	public abstract List<Cart> listCartByStatus(Integer status,Integer id);
}
