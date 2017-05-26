package com.zuoye2;

import java.io.*;
import java.net.*;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ServerRunnable implements Runnable{
	Socket socket = null;
	List<Socket> list;
	Map<String, Socket> socketHashMap = new HashMap<String,Socket>();
	public ServerRunnable(Socket socket,List<Socket> list,Map<String, Socket> socketHashMap2){
		this.socket = socket;
		this.list = list;
		this.socketHashMap = socketHashMap2;
	}
	public void run(){
		while(true){
			try{
				//服务器读入
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xiaoxi = null;
				xiaoxi = bufferedReader.readLine();
				//查找时谁发送的
				
				Set<String> keys = socketHashMap.keySet();
				String name ="";
				for(String s:keys){
					Socket so = socketHashMap.get(s);
					if(socket==so){
						name=s;
					}
				}
				
				
				
				//System.out.println("客服端内容为:"+xiaoxi);
				//String s = "服务器返回"+xiaoxi;
				System.out.println(name+":"+xiaoxi);
				String s = name+":"+xiaoxi;
				//System.out.println("客服端消息："+sbf.toString());
				//System.out.println("客户端地址："+socket.getInetAddress());
				//服务器输出
				for(Socket s1:list){
					PrintWriter printWriter = new PrintWriter(s1.getOutputStream());
					printWriter.write(s+"\n");
					printWriter.flush();
				}
			}catch(Exception e){
				
			}
		}
	}
}
