package com.yanxin;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建File实例
		/*
		File file = new File("src/com/yanxin/Text.txt");
		//重命名
		File fff  = new File("src/com/yanxin/rrr.txt");
		System.out.println("name="+file.renameTo(fff));
		//创建文件    
		try {
			file.createNewFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//创建目录
		file.mkdir();
		//得到文件名
		System.out.println("name="+file.getName());
		//绝对路径
		System.out.println("path="+file.getAbsolutePath());
		//输出的是:创建File实例的路径
		System.out.println("path1="+file.getPath());
		//返回上一级路径名
		System.out.println("Parent="+file.getParent());
		//判断是否可写
		System.out.println("canwrite="+file.canWrite());
		//判断是否可读
		System.out.println("canread="+file.canRead());
		//判断对象是文件，不是目录
		System.out.println("isfile="+file.isFile());
		//判断对象的文件是否是一个目录
		System.out.println("isdirectory="+file.isDirectory());
		//判断对象对应文件或目录是否为绝对路径名
		System.out.println("isabsolute="+file.isAbsolute());
		//判断此路径名指定的文件是否是一个隐藏文件
		System.out.println("ishidden="+file.isHidden());
		//返回文件最后一次被修改的时间
		System.out.println("lastmodified="+file.lastModified());
		//返回文件内容的长度
		System.out.println("length="+file.length());
		//删除文件
				//if(file.exists()){
				//	file.delete();
				//}
		*/
		//递归方法
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
