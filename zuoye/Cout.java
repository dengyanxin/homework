package com.zuoye2;
import java.io.*;
import java.util.Scanner;
import java.net.*;

public class Cout implements Runnable{
	Socket socket = null;
	public Cout(Socket socket){
		this.socket = socket;
	}
	public void run(){
		while(true){
			Scanner sc = new Scanner(System.in);
			try{
				System.out.println("���������ݣ�");
				String s = sc.next();
				System.out.println("�û�����������ǣ�"+s);
				PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
				printWriter.write(s+"/n");
				printWriter.flush();
			}catch(Exception e){
				
			}
		}
	}
}
