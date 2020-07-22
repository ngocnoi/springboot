package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.Book;

public interface BookService {
	public abstract Book getBook(Integer id);
	public abstract void addBook(Book book);
	public abstract void updateBook(Integer id, Book book);
	public abstract void deleteBook(Integer id);
	public abstract List<Book> listBook();
	public abstract List<Book> searchAdvance(String keyWord);
}
