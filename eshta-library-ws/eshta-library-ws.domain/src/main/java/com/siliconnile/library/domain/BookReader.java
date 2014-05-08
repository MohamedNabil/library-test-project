package com.siliconnile.library.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.pearlox.framework.domain.BasicObject;

@SuppressWarnings("serial")
@Entity
@Table(name="book_reader")
public class BookReader extends BasicObject{
	
	
	private long bookId;
	private long readerId;
	private Book book;
	private Reader reader;

	@Column(name="book_id")
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	

	@Column(name="reader_id")
	public long getReaderId() {
		return readerId;
	}
	public void setReaderId(long readerId) {
		this.readerId = readerId;
	}
	
	@ManyToOne
	@JoinColumn(name="book_id",insertable=false,updatable=false)
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	@ManyToOne
	@JoinColumn(name="reader_id",insertable=false,updatable=false)
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	

}
