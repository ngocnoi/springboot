package com.group5.librarymanagement.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	@Column
	private String fullname;
	
	@Column
	private String address;

	@Column
	private String phone;
	
	@Column
	private String mail;
	
	@Column
	private String cardNumber;
	
	@Column
	private Boolean status;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<BookOffer> getBookOffer() {
		return bookOffer;
	}

	public void setBookOffer(List<BookOffer> bookOffer) {
		this.bookOffer = bookOffer;
	}

	public List<BorrowRequest> getBorrowRequest() {
		return borrowRequest;
	}

	public void setBorrowRequest(List<BorrowRequest> borrowRequest) {
		this.borrowRequest = borrowRequest;
	}

	public List<Cart> getCart() {
		return cart;
	}

	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	@JsonIgnore
	@OneToMany(mappedBy="user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<BookOffer> bookOffer = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy="user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<BorrowRequest> borrowRequest = new ArrayList<>();
	
	//@JsonIgnore
	@OneToMany(mappedBy="user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Cart> cart;
	
}
