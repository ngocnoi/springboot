package com.group5.librarymanagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.group5.librarymanagement.Entity.Book;
import com.group5.librarymanagement.Repositories.BookRepository;
import com.group5.librarymanagement.Service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book getBook(Integer id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public void addBook(Book book) {

		Book bookCreate = new Book();

		bookCreate.setBookName(book.getBookName());
		bookCreate.setCover(book.getCover());
		bookCreate.setDescription(book.getDescription());
		bookCreate.setIsbn(book.getIsbn());
		bookCreate.setMaterial(book.getMaterial());
		bookCreate.setNumberOfPage(book.getNumberOfPage());
		bookCreate.setOverview(book.getOverview());
		bookCreate.setPrice(book.getPrice());
		bookCreate.setQuantity(book.getQuantity());
		bookCreate.setSize(book.getSize());
		bookCreate.setVersion(book.getVersion());
		bookCreate.setWeight(book.getWeight());
		bookCreate.setStatus(book.getStatus());
		bookCreate.setAuthors(book.getAuthors());
		bookCreate.setPublisher(book.getPublisher());
		bookCreate.setLanguage(book.getLanguage());
		bookCreate.setBookshelf(book.getBookshelf());
		bookCreate.setCategories(book.getCategories());
		bookCreate.setTranslators(book.getTranslators());

		bookRepository.saveAndFlush(bookCreate);

	}

	@Override
	public void updateBook(Integer id, Book book) {

		Book bookTemp = getBook(id);

		if (bookTemp != null) {

			bookTemp.setBookName(book.getBookName());
			bookTemp.setCover(book.getCover());
			bookTemp.setDescription(book.getDescription());
			bookTemp.setIsbn(book.getIsbn());
			bookTemp.setMaterial(book.getMaterial());
			bookTemp.setNumberOfPage(book.getNumberOfPage());
			bookTemp.setOverview(book.getOverview());
			bookTemp.setPrice(book.getPrice());
			bookTemp.setQuantity(book.getQuantity());
			bookTemp.setSize(book.getSize());
			bookTemp.setVersion(book.getVersion());
			bookTemp.setWeight(book.getWeight());
			bookTemp.setStatus(book.getStatus());
			if (book.getAuthors() != null) {
				bookTemp.setAuthors(book.getAuthors());
			}
			if (book.getPublisher() != null) {
				bookTemp.setPublisher(book.getPublisher());
			}
			if (book.getLanguage() != null) {
				bookTemp.setLanguage(book.getLanguage());
			}
			if (book.getBookshelf() != null) {
				bookTemp.setBookshelf(book.getBookshelf());
			}
			if (book.getCategories() != null) {
				bookTemp.setCategories(book.getCategories());
			}
			if (book.getTranslators() != null) {
				bookTemp.setTranslators(book.getTranslators());
			}
		}
		bookRepository.saveAndFlush(bookTemp);

	}

	@Override
	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Book> listBook() {
		return bookRepository.findAll();
	}

	@Override
	public List<Book> searchTitle(String keyWord) {
		// TODO Auto-generated method stub
		List<Book> listResult = new ArrayList<Book>();
		for (Book book : bookRepository.findAll()) {
			if (book.getBookName().toLowerCase().contains(keyWord.toLowerCase())) {
				listResult.add(book);
			}
		}
		return listResult;
	}

}
