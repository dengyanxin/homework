package com.yanxin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

public class Duchulai {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("src/com/yanxin/Text.txt");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
			Writer w= new FileWriter(file,true);
			w.write(s);
			w.close();
	}

}
