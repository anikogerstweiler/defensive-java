package com.epam.training.defensive.java.service;

import static com.epam.training.defensive.java.service.AOPTestHelper.createAOPProxy;

import java.util.Date;

import net.sf.oval.exception.ConstraintsViolatedException;

import org.junit.Before;
import org.junit.Test;

public class SimpleTransactionTest {

	private SimpleTransaction transaction;
	
	@Before
	public void setUp() {
		transaction = createAOPProxy(new SimpleTransaction());
	}
	
	@Test(expected = ConstraintsViolatedException.class)
	public void testAddWhenAmountNullExceptionThrown() {
		//given
		String account = "0123456789";
		Date transactionDate = new Date();
		
		//when
		transaction.add(null, account, transactionDate);
		
		//then exception thrown
		
	}

}
