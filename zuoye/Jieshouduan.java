package com.yanxin;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Jieshouduan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//��������ˣ�����ͨע��˿�
			ServerSocket serversocket = new ServerSocket(8989);
			while(true){
				System.out.println("�������˴����ɹ�");
				//������Ӧ�˿� ����
				Socket socket = serversocket.accept();
				System.out.println("���ڼ����˿�");
				InputStream inputstream = socket.getInputStream();
				byte[] bytes = new byte[1024];
				int len = 0;
				StringBuffer stringbuffer = new StringBuffer();
				while((len = inputstream.read(bytes))!=-1){
					stringbuffer.append(new String(bytes,0,len));
				}
				System.out.println("�������ˣ����Ǹ�ʲô��?");
				System.out.println("�ͻ��ˣ�"+stringbuffer.toString());
				
				inputstream.close();
				
				String address = new String(socket.getInetAddress().getHostName());
				System.out.println("���������ʵ�ַʱ"+address);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
