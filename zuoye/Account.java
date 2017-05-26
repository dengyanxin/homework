package com.quqian_keben;
//银行
public class Account {
	//封装账户编号，账户余额两个属性
	private String accountNo;
	private double balance;
	public Account(){
		
	}
	//构造器
	public Account(String accountNo,double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//下面两个方法根据accountNo来计算Account的hashcode和判断equals
	public int hashCode(){
		return accountNo.hashCode();
	}
	public boolean equals(Object obj){
		if(obj!=null&&obj.getClass()==Account.class){
			Account target = (Account)obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}
}
