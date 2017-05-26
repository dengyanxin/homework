package com.zuoye;

import java.net.*;
import java.io.*;
public class Sever{
	public static void main(String[] kl) throws IOException{
		ServerSocket serverSocket = new ServerSocket(8888);
		try{
			while(true){
				System.out.println("服务器建立成功");
				Socket socket = serverSocket.accept();
				System.out.println("正在监听");
				InputStream in = socket.getInputStream();
				//服务器读入
				byte[] b = new byte[1024];
				int len = 0;
				StringBuffer sb = new StringBuffer();
				while((len = in.read(b))!=-1){
					sb.append(new String(b,0,len));
				}
				System.out.println("服务器端：你是干什么的");
				System.out.println("客户端:"+sb.toString());
				
				String address = new String(socket.getInetAddress().getHostName());
				System.out.println("有访问者,地址是:"+address);
				
				//服务器输出
				OutputStream out = socket.getOutputStream();
				String ss = "服务端收到,over!";
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

