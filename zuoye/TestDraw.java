package com.quqian_keben;

public class TestDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ���˻�
		Account acct = new Account("1234567",1000);
		//ģ�������̶߳�ͬһ���˻�ȡǮ
		new DrawThread("��",acct,800).start();
		new DrawThread("��",acct,800).start();
	}
}
