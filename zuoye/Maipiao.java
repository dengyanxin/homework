package com.maipiao;

public class Maipiao extends Thread{
	Chuangkou chuangkou;
	public Maipiao(Chuangkou chuangkou){
		this.chuangkou = chuangkou;
	}
	public void run(){
		chuangkou.sale();
	}
}
