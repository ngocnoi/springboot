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
@Table(name = "notification")
public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer noId;
	
	@Column
	private String description;
	
	@Column
	private boolean status;

	public Librian getLibrian() {
		return librian;
	}

	public void setLibrian(Librian librian) {
		this.librian = librian;
	}

	@ManyToOne
	@JoinColumn(name = "librian_id", nullable = false, insertable = false, updatable = false)
	private Librian librian;
	public Integer getNoId() {
		return noId;
	}

	public void setNoId(Integer noId) {
		this.noId = noId;
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
	
	
}
