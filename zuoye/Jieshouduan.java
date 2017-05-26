package com.yanxin;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Jieshouduan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//创建服务端，并开通注册端口
			ServerSocket serversocket = new ServerSocket(8989);
			while(true){
				System.out.println("服务器端创建成功");
				//监听对应端口 阻塞
				Socket socket = serversocket.accept();
				System.out.println("正在监听端口");
				InputStream inputstream = socket.getInputStream();
				byte[] bytes = new byte[1024];
				int len = 0;
				StringBuffer stringbuffer = new StringBuffer();
				while((len = inputstream.read(bytes))!=-1){
					stringbuffer.append(new String(bytes,0,len));
				}
				System.out.println("服务器端：你是干什么的?");
				System.out.println("客户端："+stringbuffer.toString());
				
				inputstream.close();
				
				String address = new String(socket.getInetAddress().getHostName());
				System.out.println("有人来访问地址时"+address);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
