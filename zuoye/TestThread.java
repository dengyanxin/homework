package com.sanxiancheng;

import java.io.*;
import java.lang.*;
public class TestThread implements Runnable{
	int a;
	int b;
	File file = null;
	RandomAccessFile rd = null;
	public TestThread(int a ,int b, File file){
		this.a = a;
		this.b = b;
		this.file = file;
	}
	public void run(){
		int i = 0;
		try{
		rd = new RandomAccessFile(file,"rw");
		//rd.setLength(b);
		rd.seek(a);
		byte[] by = new byte[1024];
		int len = 0;
		StringBuffer sb = new StringBuffer();
		while((len = rd.read(by))!=-1){
			sb.append(new String(by,0,b));
			if(i==b){
				break;
			}
			i++;
		}
		String s = sb.toString();
		System.out.println(s);

		}catch(Exception e){

		}
	}
}
