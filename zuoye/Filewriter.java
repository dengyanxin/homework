package com.yanxin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ַ���
		/*
		File file = new File("src/com/yanxin/Text.txt");
		
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(file);
			String s = "abc������"; 
			fileWriter.write(s,0,s.length());
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//�ֽ���
		File file = new File("src/com/yanxin/Text.txt");
		try {
			/*FileInputStream fileinputstream = new FileInputStream(file);
			byte[] bytes = new byte[10];
			//�����ֽ���
			int len = 0;
			StringBuffer snb = new StringBuffer();
			while((len = fileinputstream.read(bytes))!=-1){
				snb.append(new String(bytes,0,len));
			}
			System.out.println(snb.toString());
			//�̵��ֽ���
			fileinputstream.read(bytes);
			String ss = new String(bytes);
			System.out.println(ss);*/
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			String s="xin";
			byte[] bytes = s.getBytes();
			fileOutputStream.write(s.getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
