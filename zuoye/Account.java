package com.quqian_keben;
//����
public class Account {
	//��װ�˻���ţ��˻������������
	private String accountNo;
	private double balance;
	public Account(){
		
	}
	//������
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
	//����������������accountNo������Account��hashcode���ж�equals
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
