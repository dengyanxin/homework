package com.yanxin;

import java.util.*;
public class TestHashSet {
	public static void main(String[] args){
		HashSet books = new HashSet();
		//�ֱ���books�������������A��������B��������C����
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
}
