package com.yanxin;

import java.io.File;
import java.io.FileReader;

public class Filereader {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输出文件
				File file = new File("src/com/yanxin/Text.txt");
				try {
					FileReader fileReader = new FileReader(file);
					//int a = fileReader.read();
					char[] chars = new char[10];//缓冲区
					//fileReader.read(chars);
					//for(char c:chars){
					//	System.out.println(c);
					//}
					String s = "";
					int geshu = 0;//知道到底读了多少个
					while((geshu = fileReader.read(chars)) != -1){
						System.out.println("读取个数"+geshu);
						String ss = new String(chars,0,geshu);
						s+=ss;
					}
					System.out.println(s);
					//System.out.println(a);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
