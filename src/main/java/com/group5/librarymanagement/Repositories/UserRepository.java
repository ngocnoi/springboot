package com.group5.librarymanagement.Repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group5.librarymanagement.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findFirstByCardNumber(String cardNumber);
    User findAllByCardNumber(String cardNumber);
}
