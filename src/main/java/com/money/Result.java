package com.money;

import java.math.BigDecimal;

public class Result {
	String orgName;
	BigDecimal money = new BigDecimal("0");
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public Result(String orgName, BigDecimal money) {
		super();
		this.orgName = orgName;
		this.money = new BigDecimal(money.toString()) ;
	}
	
}
