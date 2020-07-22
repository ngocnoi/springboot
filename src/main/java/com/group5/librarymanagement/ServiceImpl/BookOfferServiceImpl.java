package com.group5.librarymanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.librarymanagement.Entity.BookOffer;
import com.group5.librarymanagement.Repositories.BookOfferRepository;
import com.group5.librarymanagement.Service.BookOfferService;

@Service
public class BookOfferServiceImpl implements BookOfferService{
    
	@Autowired
	private BookOfferRepository Repository;

	@Override
	public BookOffer getBookOffer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookOffer addBookOffer(BookOffer bookOffer) {
		 return Repository.saveAndFlush(bookOffer);
		
	}

	@Override
	public void updateBookOffer(Integer id, BookOffer publisher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBookOffer(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<BookOffer> listAllBookOffer() {
		// TODO Auto-generated method stub
		return (List<BookOffer>) Repository.findAll();
	}

}
