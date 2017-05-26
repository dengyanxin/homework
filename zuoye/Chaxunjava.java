package com.yanxin;

import java.io.File;

public class Chaxunjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			if(f.getName().endsWith(".java")){
				System.out.println("path="+f.getAbsolutePath());
			}
		}
	}
}
