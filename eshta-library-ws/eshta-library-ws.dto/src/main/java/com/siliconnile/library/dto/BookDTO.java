package com.siliconnile.library.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.pearlox.framework.dto.BasicDTO;


/**
 * author: M.Nabil
 * Date: 7/5/14
 */
@SuppressWarnings("serial")
@XmlRootElement
public class BookDTO extends BasicDTO{

	private String title;
	private String author;
	private String ISBN;
	private Boolean lent =false;
	private String photoUrl;
	
	private List<ReaderDTO> readers;
	

	public List<ReaderDTO> getReaders() {
		return readers;
	}
	public void setReaders(List<ReaderDTO> readers) {
		this.readers = readers;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	public Boolean getLent() {
		return lent;
	}
	public void setLent(Boolean lent) {
		this.lent = lent;
	}
	


}
