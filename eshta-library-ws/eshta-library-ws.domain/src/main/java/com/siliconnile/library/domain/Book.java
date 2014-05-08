package com.siliconnile.library.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import com.pearlox.framework.domain.BasicObject;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;


/**
 * author: M.Nabil
 * Date: 7/5/14
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "book", schema = "public")
public class Book extends BasicObject{

	private String title;
	private String author;
	private String ISBN;
	private Boolean lent =false;
	private String photoUrl;
	

	private List<BookReader> bookReader;
	
	


	@Column(name ="title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name ="author")
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Column(name ="isbn")
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	@Column(name ="photo_url")
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	@Column(name ="book_lent")
	public Boolean getLent() {
		return lent;
	}
	public void setLent(Boolean lent) {
		this.lent = lent;
	}
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="book")
	public List<BookReader> getBookReader() {
		return bookReader;
	}
	public void setBookReader(List<BookReader> bookReader) {
		this.bookReader = bookReader;
	}
	


}
