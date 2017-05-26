package com.yanxin;
//类A的equals方法总是返回true，但没有重写其hashCode()方法
public class A {
	public boolean equals(Object obj){
		return true;
	}
}
