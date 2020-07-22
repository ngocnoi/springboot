package com.group5.librarymanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.librarymanagement.Entity.Author;
import com.group5.librarymanagement.Repositories.AuthorRepository;
import com.group5.librarymanagement.Service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	public Author getAuthor(Integer id) {
		return authorRepository.findById(id).get();
	}

	@Override
	public void addAuthor(Author author) {
		authorRepository.saveAndFlush(author);
	}

	@Override
	public void updateAuthor(Integer id, Author author) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAuthor(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Author> listAllAuthor() {
		return authorRepository.findAll();
	}

}
