package com.money;

import java.math.BigDecimal;

public class TransactionItem {
	String date;
	BigDecimal money=new BigDecimal("0.0");
	String state ;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public TransactionItem(String date, BigDecimal money, String state) {
		super();
		this.date = date;
		this.money = money;
		this.state = state;
	}


}
