package com.yanxin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datetime {
	public static void main(String[] args){
		System.out.println(new Date());
		//���ڸ�ʽ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��M��d��  Hʱm��s��");
		System.out.println(sdf.format(new Date()));
		Date date = new Date();
		System.out.println(date.getTime());
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		System.out.println("������"+year);
	}
}
