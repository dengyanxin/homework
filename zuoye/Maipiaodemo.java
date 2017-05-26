package com.maipiao;

public class Maipiaodemo {
	static int piao;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chuangkou chuangkou1 = new Chuangkou(piao,"´°¿Ú1");
		Chuangkou chuangkou2 = new Chuangkou(piao,"´°¿Ú2");
		Chuangkou chuangkou3 = new Chuangkou(piao,"´°¿Ú3");
		
		Maipiao maipiao1 = new Maipiao(chuangkou1);
		Maipiao maipiao2 = new Maipiao(chuangkou2);
		Maipiao maipiao3 = new Maipiao(chuangkou3);
		maipiao1.start();
		maipiao2.start();
		maipiao3.start();
		
		
	}

}
