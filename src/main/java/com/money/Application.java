package com.money;

import java.util.List;

public class Application {
	public static void main(String[] args) {
		List<TransactionItem> trans=DateBuilder.builderDate();
		System.out.println("Total Income:"+Caculator.formatDecimal(Caculator.doCacuIncome(trans)));
		System.out.println("Total Expenses:"+Caculator.formatDecimal(Caculator.doCacuExpense(trans).abs()));
		System.out.println("Total Saving:"+Caculator.formatDecimal(Caculator.doSave(trans)));
		Result result = Caculator.doTop(trans);
		System.out.println("Top Expense Category:"+Caculator.formatDecimal(result.getMoney())+"@"+result.getOrgName());
	}
}
