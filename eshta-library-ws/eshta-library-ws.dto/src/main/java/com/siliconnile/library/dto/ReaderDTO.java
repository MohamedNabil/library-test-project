package com.siliconnile.library.dto;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.pearlox.framework.domain.BasicObject;

/**
 * author: M.Nabil
 * Date: 7/5/14
 */
@SuppressWarnings("serial")
@XmlRootElement
public class ReaderDTO extends BasicObject{

	private String name;

	private Date registrationDate;
	
	private List<BookDTO> books;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
 
	public List<BookDTO> getBooks() {
		return books;
	}

	public void setBooks(List<BookDTO> books) {
		this.books = books;
	}


}
