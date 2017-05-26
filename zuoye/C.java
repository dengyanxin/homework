package com.yanxin;
//类c的hashCode()方法总是返回2，但没有重写equals()方法
public class C {
	public int hashCode(){
		return 2;
	}
	public boolean equals(Object obj){
		return true;
	}
}
