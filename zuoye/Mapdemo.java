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
		
		
		//遍历1：通过键值对对象entrySet获取键与值
		Set<Entry<String,String>> entrySet = map.entrySet();
		for(Entry<String,String> entry:entrySet){
			String Key = entry.getKey();
			String Value = entry.getValue();
			System.out.println("key="+Key+" value="+Value);
		}
		System.out.println("-------------------");
		
		//遍历2：通过键KeySet获取值
		Set<String> KeySet = map.keySet();//得到键的集合
		for(String Key:KeySet){
			String Value = map.get(Key);
			System.out.println("key="+Key+" value="+Value);
		}
		System.out.println("-------------------");
		
		
		//获取Map值的集合
		Collection values = map.values();
		System.out.println(values);
		
		
		//判断是否存在键和值
		System.out.println("contatinsKey="+map.containsKey("001"));
		System.out.println("contatinsValue="+map.containsValue("eee"));
		
		
		//向Map集合添加元素时，若键存在，则返回之前与键对应的值
		String put = map.put("000","aaa");
		System.out.println("put="+put);//输出：qqq
		
		
		//replace(K key,V value):替换功能，将旧值替换成新值，并返回旧值（若有的话）
		String replace = map.replace("003","666");
		System.out.println("replace="+replace);//输出：rrr
		System.out.println(map);
		
		//default boolean replace(K key,V oldValue,V newValue)
		//只有当键key存在，并且oldValue与newValue相等时，旧值才会被替换
		boolean success = map.replace("004","sss","111");
		System.out.println("replace="+success);//输出：true
	}
}
