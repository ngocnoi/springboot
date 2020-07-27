package com.group5.librarymanagement.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group5.librarymanagement.Entity.BookBackUp;
import com.group5.librarymanagement.Entity.Cart;
import com.group5.librarymanagement.Entity.User;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{
		List<Cart> findByStatusAndUser(Integer status, User user);

		
}
