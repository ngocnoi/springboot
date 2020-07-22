package com.group5.librarymanagement.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.group5.librarymanagement.Entity.Book;
import com.group5.librarymanagement.ServiceImpl.BookServiceImpl;

@RestController
@RequestMapping(path = "/api/book")
public class BookController {
	
	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@RequestMapping(value = "/books")
	public List<Book> getAllBook() {
		return bookServiceImpl.listBook();
	}
	
	@RequestMapping(value = "addBook", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addPublisher(@RequestBody List<Book> books) {
		Gson gson = new Gson();
		String json = gson.toJson(books);
		Book[] bookArr = gson.fromJson(json, Book[].class);
		bookServiceImpl.addBook(bookArr[0]);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/updateBook/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id")Integer id, @RequestBody List<Book> books){
		Gson gson = new Gson();
		String json = gson.toJson(books);
		Book[] bookArr = gson.fromJson(json, Book[].class);
		bookServiceImpl.updateBook(id, bookArr[0]);
		return new ResponseEntity<Book>(HttpStatus.OK);
	}

}
