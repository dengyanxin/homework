package com.yanxin;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Զ�����
		Set set = new TreeSet();//Student���
		//Set set = new TreeSet(new Mycomparator());//Mycomparator���
		set.add(new Student("���",20,100));
		set.add(new Student("����",19,90));
		set.add(new Student("�����",22,90));
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Student s = (Student)iterator.next();
			System.out.println("����:"+s.getName()+"    ����:"+s.getAge()+"    �ɼ�:"+s.getCheng());
		}
	}
}
//comparator ��������       comparable����
