package com.quqian_keben;

public class TestDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个账户
		Account acct = new Account("1234567",1000);
		//模拟两个线程对同一个账户取钱
		new DrawThread("甲",acct,800).start();
		new DrawThread("已",acct,800).start();
	}
}
