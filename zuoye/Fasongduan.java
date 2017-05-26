package com.yanxin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.Socket;

public class Fasongduan {
	public static void main(String[] arges){
			Socket socket = null;
			try {
				socket = new Socket("192.168.199.215",8989);
				System.out.println("是否连接成功"+socket.isConnected());
				java.io.OutputStream outputstream = socket.getOutputStream();
				outputstream.write("66666666666666".getBytes());
				outputstream.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
