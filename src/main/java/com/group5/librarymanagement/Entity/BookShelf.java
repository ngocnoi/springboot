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
@Table(name = "bookshelf")
public class BookShelf {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String bookShelfName;

	@Column
	private String description;

	@Column
	private Boolean status;
	
	@JsonIgnore
	@OneToMany(mappedBy = "bookshelf", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Book> listBookOfBookShelf = new ArrayList<Book>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookShelfName() {
		return bookShelfName;
	}

	public void setBookShelfName(String bookShelfName) {
		this.bookShelfName = bookShelfName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public List<Book> getListBookOfBookShelf() {
		return listBookOfBookShelf;
	}

	public void setListBookOfBookShelf(List<Book> listBookOfBookShelf) {
		this.listBookOfBookShelf = listBookOfBookShelf;
	}

	@Override
	public String toString() {
		return "BookShelf [id=" + id + ", bookShelfName=" + bookShelfName + ", description=" + description + ", status="
				+ status + "]";
	}
	
	

}
