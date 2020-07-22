package com.group5.librarymanagement.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group5.librarymanagement.Entity.BookOffer;

@Repository
public interface BookOfferRepository extends JpaRepository<BookOffer, Integer> {
	
}
