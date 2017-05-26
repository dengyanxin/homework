package com.yanxin;

import java.util.Date;
//线程睡眠
public class Testsleep {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("当前时间:"+new Date());
			//调用sleep方法让当前线程暂停1s.
			Thread.sleep(1000);
		}
	}
}
