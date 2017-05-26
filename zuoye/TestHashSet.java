package com.yanxin;

import java.util.*;
public class TestHashSet {
	public static void main(String[] args){
		HashSet books = new HashSet();
		//分别向books集合中添加两个A对象，两个B对象，两个C对象
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
}
