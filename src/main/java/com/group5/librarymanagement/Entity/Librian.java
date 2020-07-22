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
@Table(name = "librian")
public class Librian {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer librianId;
	
	@Column
	private String username;
	
	@Column
	private String address;
	
	@Column
	private String phone;
	
	@Column
	private String mail;
	
	@Column
	private Integer status;
	
	@OneToMany(mappedBy="librian",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<BorrowRequest> borrowRequest = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy="librian",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Notification> notification = new ArrayList<>();
	
	public List<BorrowRequest> getBorrowRequest() {
		return borrowRequest;
	}

	public void setBorrowRequest(List<BorrowRequest> borrowRequest) {
		this.borrowRequest = borrowRequest;
	}

	public List<Notification> getNotification() {
		return notification;
	}

	public void setNotification(List<Notification> notification) {
		this.notification = notification;
	}

	public Integer getLibrianId() {
		return librianId;
	}

	public void setLibrianId(Integer librianId) {
		this.librianId = librianId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
