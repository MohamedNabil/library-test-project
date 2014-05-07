package com.siliconnile.library.dao.impl;

import org.springframework.stereotype.Repository;

import com.pearlox.framework.dao.impl.BasicJpaDao;
import com.siliconnile.library.dao.BookDAO;
import com.siliconnile.library.domain.Book;


/**
 * author: M.Nabil
 * Date: 7/5/14
 */
@Repository
public class BookDaoImpl extends BasicJpaDao<Book> implements BookDAO  {

	public BookDaoImpl() {
		super(Book.class);
		// TODO Auto-generated constructor stub
	}


}
