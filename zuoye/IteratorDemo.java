package com.yanxin;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个集合
		Collection<String> books = new HashSet<String>();
		books.add("44444");
		books.add("22222");
		books.add("33333");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		//hasNext:如果仍有元素可以迭代，则返回 true
		while(it.hasNext()){
			//it.next()方法返回的数据类型时object类型，需要强制类型转换
			//next:返回迭代的下一个元素。 
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("22222")){
				//从集合中删除上一次next方法返回的元素
				//remove:从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。
				it.remove();
			}
		}
		System.out.println(books);
	}
}
