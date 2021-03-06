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
		//打印HashSet集合，集合元素没有重复
		System.out.println(hs);
		//取出第一个元素
		Iterator it = hs.iterator();
		R first = (R)it.next();
		//为第一个元素的count属性赋值
		first.count = -3;
		//在次输出HashSet集合，集合元素有重复元素
		System.out.println(hs);
		//删除count为-3的R对象
		hs.remove(new R(-3));
		//可以看到被删除了一个R元素
		System.out.println(hs);
		//输出false
		System.out.println("hs是否包含count为-3的R对象?"+hs.contains(new R(-3)));
		//输出false
		System.out.println("hs是否包含count为5的R对象?"+hs.contains(new R(5)));
	}
}
