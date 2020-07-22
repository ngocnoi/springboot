package com.group5.librarymanagement.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name ="bookOffer")
public class BookOffer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBookOffer;

	@Column
	private String bookName;
	
	@Column
	private String bookImage;

	@Column
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column
	private boolean status;

	public Integer getIdBookOffer() {
		return idBookOffer;
	}

	public void setIdBookOffer(Integer idBookOffer) {
		this.idBookOffer = idBookOffer;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
