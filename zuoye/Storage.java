package com.shenchanzhe;
//生产者
public class Storage {
	private final static int MAX_SIZE =100; 
	private int size=100;
	public Storage(int size){
		this.size=size;
	}
	
	
	//存货
	public synchronized void push(int number){
		if(getSize()+number<=MAX_SIZE){
			setSize(getSize()+number);
			System.out.println("生产了"+number+"当前库存为"+getSize() );
		}else{
			System.out.println("库存已满，暂停生产，等待消费者消费");
			try {
				this.wait();//让想获取该对象锁的线程处于等待状态
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//通知消费者去购买
		this.notifyAll();//线程的唤醒
	}
	//取货（消费）
	public synchronized void pop(int number){
		if(getSize()-number<0){
			System.out.println("库存不足，等待生产者生产");
			try {
				this.wait();//将线程处于阻塞状态
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			//消费
			setSize(getSize()-number);
			System.out.println("消费成功"+number+"个，当前库存为"+getSize());
		}
		//通知生产者生产
		this.notifyAll();//线程的唤醒
	}
	
	
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
