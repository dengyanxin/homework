package com.yanxin;

import java.io.File;
import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;

public class FileTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//�Ե�ǰ·��������һ��File����
		File file = new File(".");
		
		//ֱ�ӻ�ȡ�ļ���,���һ��
		System.out.println(file.getName());
		
		//��ȡ���·���ĸ�·�����ܳ�������������null
		System.out.println(file.getParent());
		
		//��ȡ����·��
		System.out.println(file.getAbsoluteFile());
		
		//��ȡ��һ��·��
		System.out.println(file.getAbsoluteFile().getParent());
		
		//�ڵ�ǰ·���´���һ����ʱ�ļ�
		File tmpFile = File.createTempFile("aaa",".txt",file);
		
		//ָ����JVM�˳�ʱɾ�����ļ�
		tmpFile.deleteOnExit();
		
		//��ϵͳ��ǰʱ����Ϊ���ļ������������ļ�
		File newFile = new File(System.currentTimeMillis()+"");
		System.out.println("newFile�����Ƿ���ڣ�"+newFile.exists());
		
		//��ָ��newFile����������һ���ļ�
		newFile.createNewFile();
		
		//��newFile����������һ��Ŀ¼����ΪnewFile�Ѿ����ڣ��������淽������false�����޷�������Ŀ¼
		newFile.mkdir();
		newFile.deleteOnExit();
		//ʹ��list�������г���ǰ·���������ļ���·��
		String[] fileList = file.list();
		System.out.println("=====��ǰ·���������ļ���·������=====");
		for(String fileName:fileList){
			System.out.println(fileName);
		}
		
		//ListRoots��̬�����г����еĴ��̸�·��
		File[] roots = File.listRoots();
		System.out.println("====ϵͳ���и�·������====");
		for(File root:roots){
			System.out.println(root);
		}
	}
}
