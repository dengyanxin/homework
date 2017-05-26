package com.qunliao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ShouRunnable implements Runnable{
	Socket socket;
	JTextArea Label;
	public ShouRunnable(Socket socket,JTextArea Label){
		this.socket = socket;
		this.Label = Label;
		
	}
	public void run() {
		while(true){
			BufferedReader bufferedReader;
			try {
				//接受服务器端返回的内容
				bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String neirong = bufferedReader.readLine();
				//显示到jlabel中
				Label.setText(Label.getText()+"\n"+neirong);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
