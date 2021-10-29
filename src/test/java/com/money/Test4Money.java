package com.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class Test4Money {
	List<TransactionItem> trans;

	@Before
	public void buildData() {
		trans = DateBuilder.builderDate();
	}

	@Test
	public void testCacuIncome() {
		assertEquals(new BigDecimal("21200"), Caculator.doCacuIncome(trans));
	}
	@Test
	public void testdCacuExpense() {
		assertEquals(new BigDecimal("-16042.99"), Caculator.doCacuExpense(trans));
	}	
	@Test
	public void testSaving() {
		assertEquals(new BigDecimal("5157.01"), Caculator.doSave(trans));
	}	
	@Test
	public void testDoTop() {
		
		Result result = Caculator.doTop(trans);
		System.out.println(new DecimalFormat("##.##").format(result.getMoney()));
		assertTrue(result.getOrgName().equals("Grocery") && Caculator.formatDecimal(result.getMoney()).equals("-6901.89"));
	}	
	
}
