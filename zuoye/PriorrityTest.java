package com.yanxin;
//�ı��߳����ȼ�
public class PriorrityTest extends Thread{
	public PriorrityTest(){
		
	}
	//����һ���в����Ĺ����������ڴ����߳�ʱָ��name
	public PriorrityTest(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(getName()+",�����ȼ���:"+getPriority()+",ѭ��������ֵΪ:"+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ı����̵߳����ȼ�
		Thread.currentThread().setPriority(6);
		for(int i=0;i<30;i++){
			if(i==10){
				PriorrityTest low = new PriorrityTest("�ͼ�");
				low.start();
				System.out.println("����֮�������ȼ�:"+low.getPriority());
				//���ø��߳�Ϊ������ȼ�
				low.setPriority(Thread.MIN_PRIORITY);
			}
			if(i==20){
				PriorrityTest high = new PriorrityTest("�߼�");
				high.start();
				System.out.println("����֮�������ȼ���"+high.getPriority());
				//���ø��߳�Ϊ������ȼ�
				high.setPriority(Thread.MAX_PRIORITY);
				
			}
		}
	}

}