package com.zuoye;

import java.io.*;
import java.net.*;
public class Client{
	public static void main(String[] kl){
		Socket socket = null;
		try{
			socket = new Socket("192.168.199.215",8888);
			System.out.println("是否连接成功"+socket.isConnected());
			OutputStream out = socket.getOutputStream();
			out.write("邓艳鑫,yes!".getBytes());
			//将socket输出流禁用
			socket.shutdownOutput();

			//接收服务器写出的内容
			InputStream in = socket.getInputStream();
			byte[] b = new byte[1024];
			int len = 0;
			int temp = 0;
			while((temp = in.read())!=-1){
				b[len]=(byte)temp;
				len++;
			}
			System.out.println(new String(b,0,len));
			in.close();
			out.close();
			
		}catch(Exception e){
			System.out.println("有异常"+e);
		}
	}
}

