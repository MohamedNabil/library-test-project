package com.siliconnile.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siliconnile.library.dao.BookDAO;
import com.siliconnile.library.domain.Book;
import com.siliconnile.library.service.api.BookService;


@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDAO bookDao;

	@Override
	public Book persistBook(Book book) {
		try {
			return bookDao.saveOrUpdate(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Book> listBooks() {
		try {
			return (List<Book>) bookDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Book getBookById(long id) {
		try {
			return (Book) bookDao.findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
