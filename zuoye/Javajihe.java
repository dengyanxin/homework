package com.yanxin;

import java.util.ArrayList;
import java.util.Collection;

public class Javajihe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection是所有集合的父类。
	    //Collection有：List、Set、Queue。都是接口
	    //Collection<String>是父类引用指向子类的实例，也就是new ArrayList
	    //而<String>是jdk5.0出现的泛型，就是add的必须是String字符串类型的。
        Collection<String> collection1 = new ArrayList<String>();// 创建一个集合对象
        collection1.add("000");// 添加对象到Collection集合中
        collection1.add("111");
        collection1.add("222");
        //size:返回此 collection 中的元素数。
        System.out.println("集合collection1的大小：" + collection1.size());
        System.out.println("集合collection1的内容：" + collection1);
        //remove:从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
        collection1.remove("000");// 从集合collection1中移除掉 "000" 这个对象
        System.out.println("集合collection1移除 000 后的内容：" + collection1);
        //contains:如果此 collection 包含指定的元素，则返回 true。
        System.out.println("集合collection1中是否包含000 ："+ collection1.contains("000"));
        System.out.println("集合collection1中是否包含111 ："+ collection1.contains("111"));
        Collection<String> collection2 = new ArrayList<String>();
        collection2.addAll(collection1);// addAll:将collection1 集合中的元素全部都加到collection2中
        System.out.println("集合collection2的内容：" + collection2);
        collection2.clear();// clear:清空集合 collection1 中的元素
        System.out.println("集合collection2是否为空 ：" + collection2.isEmpty());//isEmpty:如果此 collection 不包含元素，则返回 true。 
        // 将集合collection1转化为数组
        /**
         * 这是一个向上转型的用法。
         * 因为Object是一切类的父类，位于最高层。
         * 任何类型的对象都可以用Object来接收。
         * 看你这句代码，就是返回一个数组，所以用Object[] 数据来接收是毫无争议的。
         */
         Object s[] = collection1.toArray();
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}

