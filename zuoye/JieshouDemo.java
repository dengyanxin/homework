package com.zuoye;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//�����
public class JieshouDemo {

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
				StringBuffer sb = new StringBuffer();
				while((len = inputstream.read(bytes))!=-1){
					sb.append(new String(bytes,0,len));
				}
				System.out.println("�������ˣ����Ǹ�ʲô��?");
				System.out.println("�ͻ��ˣ�"+sb.toString());
				inputstream.close();
				String address = new String(socket.getInetAddress().getHostName());
				System.out.println("���������ʵ�ַʱ"+address);
				//����������
				File file = new File("ccc.txt");
					OutputStream out = new FileOutputStream(file,true);
					String ss = sb.toString();
					byte[] g = ss.getBytes();
					for(int i=0;i<g.length;i++){
						out.write(g[i]);
					}
					out.close();
			}		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
