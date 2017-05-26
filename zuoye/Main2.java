package com.quqian_laoshi;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zhanghu zhanghu = new Zhanghu("ЕЫбоіЮ",4000);
		Quqianthread ka = new Quqianthread(zhanghu,2000);
		Quqianthread zhe = new Quqianthread(zhanghu,3000);
		new Thread(ka).start();
		new Thread(zhe).start();
	}

}
