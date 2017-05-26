package com.yanxin;
//第5题
import java.util.Map;
import java.util.TreeMap;

public class Zifuchuan {
	 
	 /**
	  * 计算字符串中每个字符出现的个数
	  * @param str
	  * @return
	  */
	 public static Map<String, Integer> getCharCountOfString(String str){
	  Map<String, Integer> map = null;
	  
	  if(str == null || str.equals("")){
	   return null;
	  }
	  
	  int len = str.length();
	  
	  //new HashMap<String, Integer>();
	  map =  new TreeMap<String, Integer>(); 
	  
	  for (int i = 0; i < len; i++) {
	   char c = str.charAt(i);
	   Integer count = map.get(String.valueOf(c));
	   if(count == null){
	    count = new Integer(1);
	   }else{
	    count = new Integer(count.intValue()+1);
	   }
	   map.put(String.valueOf(c), count);
	  }
	  
	  return map;
	 }
	/**
	  * @param args
	  */
	 public static void main(String[] args) {
	  Map<String, Integer> map = getCharCountOfString("ECALIYHWEQAEFSZC");
	  System.out.println(map);
	 }
	}
