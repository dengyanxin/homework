package com.yanxin;

import java.util.*;

public class TestHashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		//��ӡHashSet���ϣ�����Ԫ��û���ظ�
		System.out.println(hs);
		//ȡ����һ��Ԫ��
		Iterator it = hs.iterator();
		R first = (R)it.next();
		//Ϊ��һ��Ԫ�ص�count���Ը�ֵ
		first.count = -3;
		//�ڴ����HashSet���ϣ�����Ԫ�����ظ�Ԫ��
		System.out.println(hs);
		//ɾ��countΪ-3��R����
		hs.remove(new R(-3));
		//���Կ�����ɾ����һ��RԪ��
		System.out.println(hs);
		//���false
		System.out.println("hs�Ƿ����countΪ-3��R����?"+hs.contains(new R(-3)));
		//���false
		System.out.println("hs�Ƿ����countΪ5��R����?"+hs.contains(new R(5)));
	}
}
