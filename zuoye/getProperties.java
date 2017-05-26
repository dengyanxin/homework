package com.yanxin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class getProperties {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		Properties pps = new Properties();
		pps.load(new FileInputStream("D:/workspace/Jihe/src/com/yanxin/Test.properties"));
		Enumeration enum1 = pps.propertyNames();//得到配置文件的名字
		while(enum1.hasMoreElements()){
			String strKey = (String) enum1.nextElement();
			String strValue = pps.getProperty(strKey);
			System.out.println(strKey+"="+strValue);
		}
	}

}
