package com.group5.librarymanagement.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cardId;
	
	@Column
	private Integer status;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	//@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinTable(name = "cart_book", joinColumns = { @JoinColumn(name = "cart_id") }, inverseJoinColumns = {
			@JoinColumn(name = "book_id") }) 
	private List<Book> books;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinTable(name = "cart_bookbackup", joinColumns = { @JoinColumn(name = "cart_id") }, inverseJoinColumns = {
			@JoinColumn(name = "bookbackup_id") }) 
	private List<BookBackUp> bookbackups;
	
	public Integer getCardId() {
		return cardId;
	}

	public List<BookBackUp> getBookbackups() {
		return bookbackups;
	}

	public void setBookbackups(List<BookBackUp> bookbackups) {
		this.bookbackups = bookbackups;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
