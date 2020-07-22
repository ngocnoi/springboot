package com.group5.librarymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group5.librarymanagement.Entity.BookOffer;
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
	@PostMapping("/bookoffers")
	  public BookOffer createUser( @RequestBody BookOffer bookOffer) {
	    return bookOfferServiceImpl.addBookOffer(bookOffer);
	  }
	

}
