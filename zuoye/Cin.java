package com.zuoye2;
import java.io.*;
import java.util.*;
import java.net.*;
public class Cin implements Runnable{
	Socket socket = null;
	public Cin(Socket socket){
		this.socket = socket;
	}
	public void run(){
		while(true){
			try{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String fanhui = null;
				fanhui = bufferedReader.readLine();
				System.out.println(fanhui);
			}catch(Exception e){
				
			}
		}
	}
}
