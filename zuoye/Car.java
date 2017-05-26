package com.yanxin;

public class Car {
	int number;//序号
	String name;//车名
	int money;//日租金
	int zaike;//载客数
	int zaihuo;//载货量
	public Car(int number,String name,int money,int zaike,int zaihuo){
		this.number=number;
		this.name=name;
		this.money=money;
		this.zaike = zaike;
		this.zaihuo = zaihuo;
	}
	public int getnumber(){
		return number;
	}
	public String getname(){
		return name;
	}
	public int getmoney(){
		return money;
	}
	public int getzaike(){
		return zaike;
	}
	public int getzaihuo(){
		return zaihuo;
	}
}
