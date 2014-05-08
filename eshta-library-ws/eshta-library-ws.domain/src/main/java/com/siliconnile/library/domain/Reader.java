package com.siliconnile.library.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.pearlox.framework.domain.BasicObject;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


/**
 * author: M.Nabil
 * Date: 7/5/14
 */

@Entity
@Table(name = "reader", schema = "public")
public class Reader extends BasicObject{

	private String name;

	private Date registrationDate;
	
	private List<BookReader> bookReader;
	
	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="register_date")
	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="reader")
	public List<BookReader> getBookReader() {
		return bookReader;
	}
	
	public void setBookReader(List<BookReader> bookReader) {
		this.bookReader = bookReader;
	}
    




}
