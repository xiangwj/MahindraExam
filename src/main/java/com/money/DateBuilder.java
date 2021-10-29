package com.money;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DateBuilder {
	public static List<TransactionItem> builderDate(){
	
	List<TransactionItem> items = new ArrayList();
	
	TransactionItem item = new TransactionItem("1",new BigDecimal("-3200.5"),"FoodPanda");
	items.add(item);
	
	item = new TransactionItem("2",new BigDecimal("-1740.6"),"Stationary");
	items.add(item);
	
	item = new TransactionItem("3",new BigDecimal("-2800.3"),"Grocery");
	items.add(item);		
	
	item = new TransactionItem("4",new BigDecimal("-4000"),"LoanPayment");
	items.add(item);	
	
	item = new TransactionItem("5",new BigDecimal("1200"),"Royalty");
	items.add(item);	
	
	
	item = new TransactionItem("6",new BigDecimal("-200"),"Stationary");
	items.add(item);		
	
	item = new TransactionItem("7",new BigDecimal("-2600.60"),"Grocery");
	items.add(item);		
	
	
	item = new TransactionItem("7",new BigDecimal("-1500.99"),"Grocery");
	items.add(item);		
	
	
	item = new TransactionItem("7",new BigDecimal("20000"),"Salary");
	items.add(item);
	return items;
	}
}
