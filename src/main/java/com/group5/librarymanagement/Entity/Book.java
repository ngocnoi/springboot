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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String bookName;

	@Column
	private String overview;

	@Column
	private String cover;

	@Column
	private String material;

	@Column
	private String description;

	@Column
	private Double price;

	@Column
	private Integer numberOfPage;

	@Column
	private String size;

	@Column
	private Double version;

	@Column
	private Double weight;

	@Column
	private Integer quantity;

	@Column
	private String isbn;

	@Column
	private Boolean status;
	
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ImageBook> listImageOfBook =new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "publisher_id")
	private Publisher publisher;
	
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	
	@ManyToOne
	@JoinColumn(name = "bookshelf_id")
	private BookShelf bookshelf;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinTable(name = "book_author", joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = {
			@JoinColumn(name = "author_id") })
	private List<Author> authors = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinTable(name = "book_translator", joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = {
			@JoinColumn(name = "translator_id") })
	private List<Translator> translators = new ArrayList<Translator>();
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinTable(name = "book_category", joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = {
			@JoinColumn(name = "category_id") })
	private List<Category> categories = new ArrayList<Category>();
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinTable(name = "book_borrowRequest", joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = {
			@JoinColumn(name = "borrowRequest_id") })
	private List<BorrowRequest> borrowRequest = new ArrayList<>();
	
	@JsonIgnore
	@ManyToMany(mappedBy = "books")
	private List<Cart> carts = new ArrayList<Cart>();
	
	
	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public List<BorrowRequest> getBorrowRequest() {
		return borrowRequest;
	}

	public void setBorrowRequest(List<BorrowRequest> borrowRequest) {
		this.borrowRequest = borrowRequest;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(Integer numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String iSBN) {
		isbn = iSBN;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public BookShelf getBookshelf() {
		return bookshelf;
	}

	public void setBookshelf(BookShelf bookshelf) {
		this.bookshelf = bookshelf;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List<Translator> getTranslators() {
		return translators;
	}

	public void setTranslators(List<Translator> translators) {
		this.translators = translators;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<ImageBook> getListImageOfBook() {
		return listImageOfBook;
	}

	public void setListImageOfBook(List<ImageBook> listImageOfBook) {
		this.listImageOfBook = listImageOfBook;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", overview=" + overview + ", cover=" + cover
				+ ", material=" + material + ", description=" + description + ", price=" + price + ", numberOfPage="
				+ numberOfPage + ", size=" + size + ", version=" + version + ", weight=" + weight + ", quantity="
				+ quantity + ", isbn=" + isbn + ", status=" + status + "]";
	}

}
