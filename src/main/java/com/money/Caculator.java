package com.money;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Caculator {
	public static BigDecimal doCacuIncome(List<TransactionItem> trans) {
		BigDecimal income=trans.stream().map(TransactionItem::getMoney).filter(money->money.compareTo(new BigDecimal("0"))>0).reduce(new BigDecimal("0"),(a,b)-> {
			return a.add(b);
		});
		return income;
	}
	public static BigDecimal doCacuExpense(List<TransactionItem> trans) {
		BigDecimal income=trans.stream().map(TransactionItem::getMoney).filter(money->money.compareTo(new BigDecimal("0"))<0).reduce(new BigDecimal("0"),(a,b)-> {
			return a.add(b);
		});
		return income;
	}	
	public static BigDecimal doSave(List<TransactionItem> trans) {
		BigDecimal income=trans.stream().map(TransactionItem::getMoney).reduce(new BigDecimal("0"),(a,b)-> {
			return a.add(b);
		});
		return income;
	}	
	
	public static Result doTop(List<TransactionItem> trans) {
		
		Map<String,List<TransactionItem>> groups= trans.stream().collect(Collectors.groupingBy(TransactionItem::getState));
		
		String state="";
		BigDecimal curr = new BigDecimal("0");
		BigDecimal last = new BigDecimal("0");
		String laststate="";		
		for(List<TransactionItem> lst:groups.values()) {
			curr = new BigDecimal("0");
			for(TransactionItem ls:lst) {
				if(ls.getMoney().compareTo(new BigDecimal("0"))<0) {
					curr=curr.add(ls.getMoney());
					state= ls.getState();
					
				}
			}
			
			if(curr.compareTo(last)<0) {
				last=new BigDecimal(curr.doubleValue());;
				laststate=state;
			}
		}	
		Result result = new Result(laststate,last);
		return result;
	}	
	public static String formatDecimal(BigDecimal decimal) {

		return new DecimalFormat("##.##").format(decimal);
	}
}
