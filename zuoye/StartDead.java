package com.yanxin;
//�߳�����
public class StartDead extends Thread{
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����̶߳���
		StartDead sd = new StartDead();
		for(int i=0;i<300;i++){
			//����Thread��currentThread������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName()+""+i);
			if(i==20){
				//�����߳�
				sd.start();
				//�ж��������̵߳�isAlive()ֵ�����true
				System.out.println(sd.isAlive());
			}
			//ֻ�е��̴߳����½�����������״̬ʱisAlive��������false��
			//��Ϊi>20,����߳̿϶��Ѿ������ˣ�����ֻ����ʱ����״̬�ˡ�
			if(i>20&&!sd.isAlive()){
				//��ͼ�ٴ��������߳�
				sd.start();
			}
		}
	}

}
