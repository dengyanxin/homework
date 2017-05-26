package com.shenchanzhe;
//������
public class Storage {
	private final static int MAX_SIZE =100; 
	private int size=100;
	public Storage(int size){
		this.size=size;
	}
	
	
	//���
	public synchronized void push(int number){
		if(getSize()+number<=MAX_SIZE){
			setSize(getSize()+number);
			System.out.println("������"+number+"��ǰ���Ϊ"+getSize() );
		}else{
			System.out.println("�����������ͣ�������ȴ�����������");
			try {
				this.wait();//�����ȡ�ö��������̴߳��ڵȴ�״̬
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//֪ͨ������ȥ����
		this.notifyAll();//�̵߳Ļ���
	}
	//ȡ�������ѣ�
	public synchronized void pop(int number){
		if(getSize()-number<0){
			System.out.println("��治�㣬�ȴ�����������");
			try {
				this.wait();//���̴߳�������״̬
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			//����
			setSize(getSize()-number);
			System.out.println("���ѳɹ�"+number+"������ǰ���Ϊ"+getSize());
		}
		//֪ͨ����������
		this.notifyAll();//�̵߳Ļ���
	}
	
	
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
