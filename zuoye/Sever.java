package com.zuoye;

import java.net.*;
import java.io.*;
public class Sever{
	public static void main(String[] kl) throws IOException{
		ServerSocket serverSocket = new ServerSocket(8888);
		try{
			while(true){
				System.out.println("�����������ɹ�");
				Socket socket = serverSocket.accept();
				System.out.println("���ڼ���");
				InputStream in = socket.getInputStream();
				//����������
				byte[] b = new byte[1024];
				int len = 0;
				StringBuffer sb = new StringBuffer();
				while((len = in.read(b))!=-1){
					sb.append(new String(b,0,len));
				}
				System.out.println("�������ˣ����Ǹ�ʲô��");
				System.out.println("�ͻ���:"+sb.toString());
				
				String address = new String(socket.getInetAddress().getHostName());
				System.out.println("�з�����,��ַ��:"+address);
				
				//���������
				OutputStream out = socket.getOutputStream();
				String ss = "������յ�,over!";
				byte[] s = ss.getBytes();
				out.write(s);
				out.close();
				in.close();

			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

