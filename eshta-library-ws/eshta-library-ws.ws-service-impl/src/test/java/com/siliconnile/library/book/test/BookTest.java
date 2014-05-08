package com.siliconnile.library.book.test;

import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.AssertJUnit;

import com.siliconnile.library.dao.BookDAO;
import com.siliconnile.library.domain.Book;
import com.siliconnile.library.dto.BookDTO;
import com.siliconnile.library.ws.service.api.LendBookWebService;



@ContextConfiguration(locations = { "/test-beans.xml",
		"classpath:dao-config.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class BookTest extends AbstractTransactionalTestNGSpringContextTests {

	@Autowired
	private LendBookWebService lendBookWS;
	

	
	@Test
	@Rollback
	public void testAddBook()
	{
		
		BookDTO bookDTO=lendBookWS.addBooK("harrypotter", "J.K Rowling","2132141414", "photo");
		
		AssertJUnit.assertEquals("harrypotter", bookDTO.getTitle());
	}
	
	@Test
	@Rollback
	public void testLendBookById()
	{
		long id=1;
		BookDTO bookDTO=lendBookWS.lendBooKById(id);
		
		AssertJUnit.assertNotNull(bookDTO);
	}

}
