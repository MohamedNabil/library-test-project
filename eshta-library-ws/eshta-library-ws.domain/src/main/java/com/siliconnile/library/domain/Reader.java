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


/**
 * author: M.Nabil
 * Date: 7/5/14
 */

@Entity
@Table(name = "reader", schema = "public")
public class Reader extends BasicObject{

	private String name;

	private Date registrationDate;
	
	private List<Book> books;
	
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
    
	@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="EMPLOYEE_MEETING",
                joinColumns={@JoinColumn(name="reader_id")},
                inverseJoinColumns={@JoinColumn(name="id")})
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}


}
