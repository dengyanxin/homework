package com.yanxin;

import java.io.File;
import java.io.FileReader;

public class Filereader {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ļ�
				File file = new File("src/com/yanxin/Text.txt");
				try {
					FileReader fileReader = new FileReader(file);
					//int a = fileReader.read();
					char[] chars = new char[10];//������
					//fileReader.read(chars);
					//for(char c:chars){
					//	System.out.println(c);
					//}
					String s = "";
					int geshu = 0;//֪�����׶��˶��ٸ�
					while((geshu = fileReader.read(chars)) != -1){
						System.out.println("��ȡ����"+geshu);
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
