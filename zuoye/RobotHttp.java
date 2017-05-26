package com.robot;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class RobotHttp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String userTalk = sc.next();
		// TODO Auto-generated method stub
		//URL
		//String url = "http://www.baidu.com";//��վԴ��
		//String url = "http://img2.niutuku.com/desk/1207/1006/ntk122776.jpg";//ͼƬ
		String url = "http://www.tuling123.com/openapi/api?key=8bc258bf4a2246138766b48721472953&infor=userTalk";//������
		try {
			
			URL url1 = new URL(url);
			
			URLConnection urlConnection = url1.openConnection();
			
			urlConnection.connect();
			
			
			
			/*InputStream InputStream = urlConnection.getInputStream();
			byte[] bytes = new byte[1024];
			int len = 0;
			File file = new File("1.jpg");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			while((len=InputStream.read(bytes))!=-1){
				fileOutputStream.write(bytes, 0, len);
			}*/
			
			
			/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			System.out.println(bufferedReader.readLine());
			bufferedReader.readLine();*/
			
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			StringBuffer stringBuffer = new StringBuffer();
			String s = "";
			s=bufferedReader.readLine();
			String[] strings = s.split(":");
			String[] strings1 = strings[2].split("\"");
			System.out.println(strings1[1]);
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
		
		
	}
}
