package com.yanxin;

import java.io.*;

public class Wenjian {
	public void go() throws Exception {
		File file = new File("C:/gg/hello.txt");
		fileCopy(file);
		System.out.println(file.getName());
	
	}
	
	public void fileCopy(File file) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
	
		File[] firstF = file.listFiles();
		firstF[1].getName();
		for (int j = 0; j < firstF.length; j++) {
			File[] subF = firstF[j].listFiles();
			for (int i = 0; i < subF.length; i++) {
				fis = new FileInputStream(subF[i]);
				String st=subF[i].getName();
				fos = new FileOutputStream("C:/back"+st);
				int byt;
				while ((byt = fis.read()) != -1) {
					fos.write(byt);
				}
	
			}
		}
		fis.close();
		fos.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Wenjian().go();
	}	
}