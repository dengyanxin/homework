package com.yanxin;

import java.util.*;
import java.util.Map.Entry;
public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("000","qqq");
		map.put("003","rrr");
		map.put("001","www");
		map.put("002","eee");
		map.put("004","sss");
		
		
		//����1��ͨ����ֵ�Զ���entrySet��ȡ����ֵ
		Set<Entry<String,String>> entrySet = map.entrySet();
		for(Entry<String,String> entry:entrySet){
			String Key = entry.getKey();
			String Value = entry.getValue();
			System.out.println("key="+Key+" value="+Value);
		}
		System.out.println("-------------------");
		
		//����2��ͨ����KeySet��ȡֵ
		Set<String> KeySet = map.keySet();//�õ����ļ���
		for(String Key:KeySet){
			String Value = map.get(Key);
			System.out.println("key="+Key+" value="+Value);
		}
		System.out.println("-------------------");
		
		
		//��ȡMapֵ�ļ���
		Collection values = map.values();
		System.out.println(values);
		
		
		//�ж��Ƿ���ڼ���ֵ
		System.out.println("contatinsKey="+map.containsKey("001"));
		System.out.println("contatinsValue="+map.containsValue("eee"));
		
		
		//��Map�������Ԫ��ʱ���������ڣ��򷵻�֮ǰ�����Ӧ��ֵ
		String put = map.put("000","aaa");
		System.out.println("put="+put);//�����qqq
		
		
		//replace(K key,V value):�滻���ܣ�����ֵ�滻����ֵ�������ؾ�ֵ�����еĻ���
		String replace = map.replace("003","666");
		System.out.println("replace="+replace);//�����rrr
		System.out.println(map);
		
		//default boolean replace(K key,V oldValue,V newValue)
		//ֻ�е���key���ڣ�����oldValue��newValue���ʱ����ֵ�Żᱻ�滻
		boolean success = map.replace("004","sss","111");
		System.out.println("replace="+success);//�����true
	}
}
