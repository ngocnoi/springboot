package com.group5.librarymanagement.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group5.librarymanagement.Entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{
		List<Cart> findAllByStatusAndUser(Integer status, Integer id); 
}
