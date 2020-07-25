package com.group5.librarymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.group5.librarymanagement.Entity.BookOffer;
import com.group5.librarymanagement.Entity.User;
import com.group5.librarymanagement.Service.BookOfferService;
import com.group5.librarymanagement.ServiceImpl.BookOfferServiceImpl;

@RestController
@RequestMapping(path = "/api")
public class BookOfferController {
	@Autowired
	private BookOfferService bookOfferServiceImpl;
	
	@RequestMapping(value = "/BookOffer")
	public List<BookOffer> getAllPublisher() {
		return bookOfferServiceImpl.listAllBookOffer();
	}
	
	@PostMapping("/addBookOffer/new")
	  public BookOffer createBookOffer(@RequestBody BookOffer bookOffer) {
	    return bookOfferServiceImpl.addBookOffer(bookOffer);
	  }
	
	@RequestMapping(value = "/addbookoffers", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = "application/json; charset=UTF-8")
	  public ResponseEntity<Void> createUser( @RequestBody List<BookOffer> bookOffer) {
		Gson gson = new Gson();
		String json = gson.toJson(bookOffer);
		BookOffer[] bookOfferArr = gson.fromJson(json, BookOffer[].class);
		bookOfferServiceImpl.addBookOffer(bookOfferArr[0]);
	    return new ResponseEntity<Void>(HttpStatus.CREATED);
	  }
	

}
