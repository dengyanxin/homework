package com.yanxin;

import java.util.*;
public class Mapmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map = new HashMap<String,Student>();
		map.put("000",new Student("����1",11, 100));
		map.put("003",new Student("����2",15,85));
		map.put("001",new Student("����3",12,89));
		map.put("002",new Student("����4",14,78));
		map.put("004",new Student("����5",13,56));
		
		//��ȡԪ��
		Student student = map.get("000");
		System.out.println("����:"+student.getName());
		//ɾ��
		map.remove("001");
		//���
		map.clear();
		
		//map����
		Set<String> Key = map.keySet();
		//map��ֵ�Ƚϴ�   �Ƽ�ʹ��for��������ͬ���͵�
		for(String s:Key){
			System.out.println(s+"");
		}
		Iterator iterator = Key.iterator();
		while(iterator.hasNext()){
			String key = (String) iterator.next();
			System.out.println("key is"+Key +"value is"+map);
		}
	}

}
