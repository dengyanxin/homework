package com.yanxin;

public class Child extends Parent{
	protected String value = "456";
	public static void main(String[] arges){
		Child c = new Child();
		System.out.println(c.getValue());
	}
}
