package com.yanxin;

//ͨ���̳�Thread���������߳���
public class Xianchengdemo extends Thread{
	private int i;
	//��дrun������run�����ķ���������߳�ִ����
	public void run(){
		for(;i<100;i++){
			//���߳���̳�Thread��ʱ������ֱ�ӵ���getName()���������ص�ǰ�̵߳�����
			//������ȡ��ǰ�̣߳�ֱ��ʹ��this����
			//Thread�����getName()���ص�ǰ���̵߳�����
			System.out.println(getName()+""+i);
		}
	}
	public static void main(String[] arges){
		for(int i=0;i<100;i++){
			//����Thread��currentThread������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName()+""+i);
			if(i==20){
				//������������һ���߳�
				new Xianchengdemo().start();
				//�����������ڶ����߳�
				new Xianchengdemo().start();
			}
		}
	}
}
