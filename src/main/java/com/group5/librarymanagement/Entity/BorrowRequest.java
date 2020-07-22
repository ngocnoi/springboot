package com.group5.librarymanagement.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "borrowRequest")
public class BorrowRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestId;
	
	@Column
	private String dateBorrow;
	
	@Column
	private String dateReturn;
	
	@Column
	private float penaltyMoney;
	
	@Column
	private Integer isDelete;
	
	@Column
	private Integer status;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
	private User user;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "borrowRequest")
	private List<Book> books = new ArrayList<Book>();
	
	@ManyToOne
	@JoinColumn(name = "librian_id", nullable = false, insertable = false, updatable = false)
	private Librian librian;
	
	public Integer getRequestId() {
		return requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	public String getDateBorrow() {
		return dateBorrow;
	}

	public void setDateBorrow(String dateBorrow) {
		this.dateBorrow = dateBorrow;
	}

	public String getDateReturn() {
		return dateReturn;
	}

	public void setDateReturn(String dateReturn) {
		this.dateReturn = dateReturn;
	}

	public float getPenaltyMoney() {
		return penaltyMoney;
	}

	public void setPenaltyMoney(float penaltyMoney) {
		this.penaltyMoney = penaltyMoney;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
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

	public Librian getLibrian() {
		return librian;
	}

	public void setLibrian(Librian librian) {
		this.librian = librian;
	}
}
