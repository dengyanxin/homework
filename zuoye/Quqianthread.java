package com.quqian_laoshi;

public class Quqianthread implements Runnable{
	private Zhanghu zhanghu;
	private int money;
	public Quqianthread(Zhanghu zhanghu,int money){
		this.zhanghu=zhanghu;
		this.money=money;
	}
	
	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ͬ�������
		//�൱�ڽ�zhanghu������ס�ˡ�ֻ��ִ�������飬�ſ����ͷŶ��������̲߳����õ�������󣬲����������ס
		synchronized(zhanghu){
			if(zhanghu.getNumber()>=money){
				//�˻����
				zhanghu.setNumber(zhanghu.getNumber()-money);
				System.out.println("ȡǮ�ɹ���ȡ����"+money+"Ԫ�������"+zhanghu.getNumber());
				
			}else{
				System.out.println("����,��ǰ���"+zhanghu.getNumber()+"��"+(money-zhanghu.getNumber()));
			}
		}
	}
}
