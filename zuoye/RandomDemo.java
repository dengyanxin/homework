package com.zuoye;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Text.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File file1 = new File("eee.txt");
		if(!file1.exists()){
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//String userInput="";
		RandomAccessFile randomaccessfile = null;
		try {
			randomaccessfile = new RandomAccessFile(file,"rw");
			try {
				randomaccessfile.seek((file.length())/3);
				//randomaccessfile.write(b, off, len);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(randomaccessfile!=null){
				try {
					randomaccessfile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
