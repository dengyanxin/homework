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
		//同步代码块
		//相当于将zhanghu对象锁住了。只有执行完代码块，才可以释放对象，其他线程才能拿到这个对象，并将其继续锁住
		synchronized(zhanghu){
			if(zhanghu.getNumber()>=money){
				//账户余额
				zhanghu.setNumber(zhanghu.getNumber()-money);
				System.out.println("取钱成功，取走了"+money+"元，余额是"+zhanghu.getNumber());
				
			}else{
				System.out.println("余额不足,当前余额"+zhanghu.getNumber()+"差"+(money-zhanghu.getNumber()));
			}
		}
	}
}
