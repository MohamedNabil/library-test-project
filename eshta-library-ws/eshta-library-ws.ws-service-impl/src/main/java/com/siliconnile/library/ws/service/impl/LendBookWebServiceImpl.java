package com.siliconnile.library.ws.service.impl;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.springframework.beans.factory.annotation.Autowired;

import com.siliconnile.library.dao.BookDAO;
import com.siliconnile.library.domain.Book;
import com.siliconnile.library.dto.BookDTO;
import com.siliconnile.library.ws.service.api.LendBookWebService;;


/**
 * author: M.Nabil
 * Date: 7/5/14
 */
public class LendBookWebServiceImpl implements LendBookWebService {

	@Autowired
	private BookDAO bookDao;
	
	
	@Override
	public BookDTO lendBooKById( Long id,HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		try {
			Book book =bookDao.findById(id);
			
			BookDTO bookDTO = convertToBookDTO(book);
			return bookDTO;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}

	@Override
	public BookDTO addBooK(String title,
	 String author, String isbn, String photoUrl,
			@Context HttpServletResponse response) {
		// TODO Auto-generated method stub
		

		try {
			Book book=new Book();
			
			
			book.setAuthor(author);
			book.setTitle(title);
			book.setISBN(isbn);
			book.setPhotoUrl(photoUrl);
			bookDao.saveOrUpdate(book);
			
			BookDTO bookDTO =convertToBookDTO(book);
			
			return bookDTO;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public BookDTO convertToBookDTO(Book book){
		
		BookDTO bookDTO = new BookDTO();
		
		bookDTO.setAuthor(book.getAuthor());
		bookDTO.setISBN(book.getISBN());
		bookDTO.setTitle(book.getTitle());
		bookDTO.setLent(book.getLent());
		bookDTO.setPhotoUrl(book.getPhotoUrl());
	//	bookDTO.setReaders(book.getReaders());
		
		return bookDTO;
		
	}



	
	
}
