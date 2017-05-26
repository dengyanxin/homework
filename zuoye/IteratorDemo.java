package com.yanxin;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		Collection<String> books = new HashSet<String>();
		books.add("44444");
		books.add("22222");
		books.add("33333");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		//hasNext:�������Ԫ�ؿ��Ե������򷵻� true
		while(it.hasNext()){
			//it.next()�������ص���������ʱobject���ͣ���Ҫǿ������ת��
			//next:���ص�������һ��Ԫ�ء� 
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("22222")){
				//�Ӽ�����ɾ����һ��next�������ص�Ԫ��
				//remove:�ӵ�����ָ��� collection ���Ƴ����������ص����һ��Ԫ�أ���ѡ��������
				it.remove();
			}
		}
		System.out.println(books);
	}
}
