package com.group5.librarymanagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.group5.librarymanagement.Entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
