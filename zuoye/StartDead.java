package com.yanxin;
//线程死亡
public class StartDead extends Thread{
	private int i;
	//重写run方法，run方法的方法体就是线程执行体
	public void run(){
		for(;i<100;i++){
			//当线程类继承Thread类时，可以直接调用getName()方法来返回当前线程的名。
			//如果想获取当前线程，直接使用this即可
			//Thread对象的getName()返回当前该线程的名字
			System.out.println(getName()+""+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建线程对象
		StartDead sd = new StartDead();
		for(int i=0;i<300;i++){
			//调用Thread的currentThread方法获取当前线程
			System.out.println(Thread.currentThread().getName()+""+i);
			if(i==20){
				//启动线程
				sd.start();
				//判断启动后线程的isAlive()值，输出true
				System.out.println(sd.isAlive());
			}
			//只有当线程处于新建，死亡两种状态时isAlive方法返回false。
			//因为i>20,则该线程肯定已经启动了，所以只可能时死亡状态了。
			if(i>20&&!sd.isAlive()){
				//试图再次启动该线程
				sd.start();
			}
		}
	}

}
