package com.sanxiancheng;

import java.io.*;

public class Test{
	public static void main(String[] kn){
		
		try{
			//long beginTime  = System.currentTimeMillis();
			File file = new File("Test.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			int a = (int)file.length();
			new Thread(new TestThread(0,a*1/3,file)).start();
			new Thread(new TestThread(a*1/3,a*1/3,file)).start();
			new Thread(new TestThread(a*2/3,a,file)).start();
			//long endTime = System.currentTimeMillis();
			//long time = endTime - beginTime;
			//System.out.println("运行时间:"+time);
		}catch(IOException e){
			System.out.println(e);
		}
		
		
	}
}
