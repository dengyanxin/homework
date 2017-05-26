package com.quqian_keben;

public class DrawThread extends Thread{
	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ����Ǯ��
	private double drawAmount;
	public DrawThread(String name,Account account,double drawAmount){
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	//�������߳��޸�ͬһ����������ʱ�����漰���ݰ�ȫ����
	public void run(){
		//�˻�������ȡǮ��Ŀ
		if(account.getBalance()>=drawAmount){
			//�³���Ʊ
			System.out.println(getName()+"ȡǮ�ɹ����³���Ʊ��"+drawAmount);
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//�޸����
			account.setBalance(account.getBalance()-drawAmount);
			System.out.println("\t���Ϊ��"+account.getBalance());
			
		}else{
			System.out.println(getName()+"ȡǮʧ�ܣ����㣡");
		}
	}
}