package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.Author;

public interface AuthorService {
	public abstract Author getAuthor(Integer id);
	public abstract void addAuthor(Author author);
	public abstract void updateAuthor(Integer id, Author author);
	public abstract void deleteAuthor(Integer id);
	public abstract List<Author> listAllAuthor();
}
