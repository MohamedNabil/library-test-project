package com.siliconnile.library.service.api;

import com.siliconnile.library.domain.Book;
import java.util.*;

/**
 * author: M.Nabil
 * Date: 7/5/14
 */
public interface BookService {

	Book persistBook(Book book);
	List<Book> listBooks();
	Book getBookById(long id);
}