package com.yanxin;
//类B的hashCode()方法总是返回1，但没有重写equals()方法
public class B {
	public int hashCode(){
		return 1;
	}
}
