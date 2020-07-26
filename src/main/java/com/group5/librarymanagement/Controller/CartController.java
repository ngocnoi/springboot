package com.group5.librarymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group5.librarymanagement.Entity.Cart;
import com.group5.librarymanagement.ServiceImpl.CartServiceImpl;

@RestController
@RequestMapping(path = "/api")
public class CartController {
	
	@Autowired
	private CartServiceImpl cartServiceImpl;
	
	@RequestMapping(value = "/listCart", method =RequestMethod.GET)
	public List<Cart> listCart(){
		return cartServiceImpl.listCart();
	}
	
	@RequestMapping(value = "/listCartByStatus", method =RequestMethod.GET)
	public List<Cart> listCartByStatus(@PathVariable Integer status,@PathVariable Integer id){
		return cartServiceImpl.listCartByStatus(status, id);
	}
	
	@RequestMapping(value = "/addCart", method = RequestMethod.POST)
	public ResponseEntity<Void> addCart(@RequestBody Cart cart){
		cartServiceImpl.addCart(cart);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
}
