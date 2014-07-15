package com.epam.training.defensive.java.service;

import java.math.BigDecimal;
import java.util.Date;

import net.sf.oval.constraint.DateRange;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotNegative;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

import com.epam.training.defensive.java.interfaces.Transaction;

@Guarded
public class SimpleTransaction implements Transaction {

	@NotNull
	@Override
	public String add(@NotNull @NotNegative BigDecimal amount, 
			@NotNull @Length(max=10, min=10) String account, 
			@NotNull @DateRange(min="today") Date transactionDate) {

		return "";
	}

	@NotNull
	@Override
	public String withdraw(@NotNull @NotNegative BigDecimal amount, 
			@NotNull @Length(max=10, min=10) String account,
			@NotNull @DateRange(min="today") Date transactionDate) {
		
		return "";
	}

	@Override
	public String transfer(@NotNull @NotNegative BigDecimal amount, 
			@NotNull @Length(max=10, min=10) String accountFrom,
			@NotNull @Length(max=10, min=10) String accountTo, 
			@NotNull @DateRange(min="today") Date transactioDate) {
		
		return "";
	}

}
