package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.BookShelf;

public interface BookShelfService {
	public abstract BookShelf getBookShelf(Integer id);
	public abstract void addBookShelf(BookShelf bookShelf);
	public abstract void updateBookShelf(BookShelf bookShelf, Integer id);
	public abstract void deleteBookShelf(Integer id);
	public abstract List<BookShelf> listBookShelf();
}
