package com.yanxin;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自动排序
		Set set = new TreeSet();//Student类的
		//Set set = new TreeSet(new Mycomparator());//Mycomparator类的
		set.add(new Student("李白",20,100));
		set.add(new Student("貂蝉",19,90));
		set.add(new Student("孙悟空",22,90));
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Student s = (Student)iterator.next();
			System.out.println("姓名:"+s.getName()+"    年龄:"+s.getAge()+"    成绩:"+s.getCheng());
		}
	}
}
//comparator 定制排序       comparable排序
