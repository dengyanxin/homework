package com.yanxin;

import java.util.ArrayList;
import java.util.Collection;

public class Javajihe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection�����м��ϵĸ��ࡣ
	    //Collection�У�List��Set��Queue�����ǽӿ�
	    //Collection<String>�Ǹ�������ָ�������ʵ����Ҳ����new ArrayList
	    //��<String>��jdk5.0���ֵķ��ͣ�����add�ı�����String�ַ������͵ġ�
        Collection<String> collection1 = new ArrayList<String>();// ����һ�����϶���
        collection1.add("000");// ��Ӷ���Collection������
        collection1.add("111");
        collection1.add("222");
        //size:���ش� collection �е�Ԫ������
        System.out.println("����collection1�Ĵ�С��" + collection1.size());
        System.out.println("����collection1�����ݣ�" + collection1);
        //remove:�Ӵ� collection ���Ƴ�ָ��Ԫ�صĵ���ʵ����������ڵĻ�����ѡ��������
        collection1.remove("000");// �Ӽ���collection1���Ƴ��� "000" �������
        System.out.println("����collection1�Ƴ� 000 ������ݣ�" + collection1);
        //contains:����� collection ����ָ����Ԫ�أ��򷵻� true��
        System.out.println("����collection1���Ƿ����000 ��"+ collection1.contains("000"));
        System.out.println("����collection1���Ƿ����111 ��"+ collection1.contains("111"));
        Collection<String> collection2 = new ArrayList<String>();
        collection2.addAll(collection1);// addAll:��collection1 �����е�Ԫ��ȫ�����ӵ�collection2��
        System.out.println("����collection2�����ݣ�" + collection2);
        collection2.clear();// clear:��ռ��� collection1 �е�Ԫ��
        System.out.println("����collection2�Ƿ�Ϊ�� ��" + collection2.isEmpty());//isEmpty:����� collection ������Ԫ�أ��򷵻� true�� 
        // ������collection1ת��Ϊ����
        /**
         * ����һ������ת�͵��÷���
         * ��ΪObject��һ����ĸ��࣬λ����߲㡣
         * �κ����͵Ķ��󶼿�����Object�����ա�
         * ���������룬���Ƿ���һ�����飬������Object[] �����������Ǻ�������ġ�
         */
         Object s[] = collection1.toArray();
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}

