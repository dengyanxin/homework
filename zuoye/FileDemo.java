package com.yanxin;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Fileʵ��
		/*
		File file = new File("src/com/yanxin/Text.txt");
		//������
		File fff  = new File("src/com/yanxin/rrr.txt");
		System.out.println("name="+file.renameTo(fff));
		//�����ļ�    
		try {
			file.createNewFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����Ŀ¼
		file.mkdir();
		//�õ��ļ���
		System.out.println("name="+file.getName());
		//����·��
		System.out.println("path="+file.getAbsolutePath());
		//�������:����Fileʵ����·��
		System.out.println("path1="+file.getPath());
		//������һ��·����
		System.out.println("Parent="+file.getParent());
		//�ж��Ƿ��д
		System.out.println("canwrite="+file.canWrite());
		//�ж��Ƿ�ɶ�
		System.out.println("canread="+file.canRead());
		//�ж϶������ļ�������Ŀ¼
		System.out.println("isfile="+file.isFile());
		//�ж϶�����ļ��Ƿ���һ��Ŀ¼
		System.out.println("isdirectory="+file.isDirectory());
		//�ж϶����Ӧ�ļ���Ŀ¼�Ƿ�Ϊ����·����
		System.out.println("isabsolute="+file.isAbsolute());
		//�жϴ�·����ָ�����ļ��Ƿ���һ�������ļ�
		System.out.println("ishidden="+file.isHidden());
		//�����ļ����һ�α��޸ĵ�ʱ��
		System.out.println("lastmodified="+file.lastModified());
		//�����ļ����ݵĳ���
		System.out.println("length="+file.length());
		//ɾ���ļ�
				//if(file.exists()){
				//	file.delete();
				//}
		*/
		//�ݹ鷽��
		File file = new File("src");
		findFile(file);
		}
		public static void findFile(File f){
			if(f.isDirectory()){
				File[] files = f.listFiles();
				for(File f1:files){
					findFile(f1);
				}
			}else{
					System.out.println("path="+f.getAbsolutePath());
		}
	}
}
