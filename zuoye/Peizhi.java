package com.yanxin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Peizhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		File file = new File("Text.txt");
		if(!file.exists()){
			try {	
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//�û����������
		String userInput="";
		System.out.println("��������Ҫ���������");
		userInput=sc.nextLine();
		//�ȶ�ȡԭ���ļ�������
		StringBuffer stringbuffer = new StringBuffer();
		int len;
		byte[] bytes = new byte[1024];
		FileInputStream fileinputstream = null;
		try {
			fileinputstream = new FileInputStream(file);
			while((len = fileinputstream.read(bytes))!=-1){
				stringbuffer.append(new String(bytes));
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			if(fileinputstream!=null){
				try {
					fileinputstream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//ԭ���ļ�������
		String oldcontext = stringbuffer.toString();
		String writercontext = "";
		if("".equals(oldcontext)){
			writercontext = userInput+"\n";
		}else{
			writercontext = oldcontext+userInput;
		}
		
		//д��
		FileWriter filewriter = null;		
		try {
			filewriter = new FileWriter(file);
			filewriter.write(writercontext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{			
			if(filewriter!=null){
				try {
					filewriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if(writercontext.equals(writercontext)){
			System.out.println("��½�ɹ�");
		}
	}
}
