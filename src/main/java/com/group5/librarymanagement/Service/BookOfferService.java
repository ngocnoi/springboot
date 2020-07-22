package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.BookOffer;

public interface BookOfferService {
	public abstract BookOffer getBookOffer(Integer id);
	public abstract BookOffer addBookOffer(BookOffer bookOffer);
	public abstract void updateBookOffer(Integer id, BookOffer bookOffer);
	public abstract void deleteBookOffer(Integer id);
	public abstract List<BookOffer> listAllBookOffer();  
}
