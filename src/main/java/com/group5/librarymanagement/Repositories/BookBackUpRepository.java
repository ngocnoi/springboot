package com.group5.librarymanagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group5.librarymanagement.Entity.BookBackUp;

public interface BookBackUpRepository extends JpaRepository<BookBackUp, Integer> {

}
