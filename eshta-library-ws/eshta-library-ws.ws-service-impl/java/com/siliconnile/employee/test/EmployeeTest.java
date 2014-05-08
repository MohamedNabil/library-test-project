package com.siliconnile.employee.test;

import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.AssertJUnit;

import com.siliconnile.dto.EmployeeDTO;
import com.siliconnile.ws.service.api.EmployeeWebService;

@ContextConfiguration(locations = { "/test-beans.xml",
		"classpath:dao-config.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class EmployeeTest extends AbstractTransactionalTestNGSpringContextTests {

	@Autowired
	private EmployeeWebService employeeWebService;

	@Test
	@Rollback
	public void testAddEmployee() {

		EmployeeDTO employee = employeeWebService.addEmployee("mohamed", "0199123213","34");

		AssertJUnit.assertEquals("mohamed", employee.getName());
	}

}
