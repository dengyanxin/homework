package com.yanxin;

import java.util.Date;
//�߳�˯��
public class Testsleep {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("��ǰʱ��:"+new Date());
			//����sleep�����õ�ǰ�߳���ͣ1s.
			Thread.sleep(1000);
		}
	}
}
