package com.shenchanzhe;

public class Producter implements Runnable{
	private Storage storage;
	private int number;
	public Producter(Storage storage,int number){
		this.storage=storage;
		this.number=number;
	}
	public void run(){
		while(true){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			storage.push(number);
		}
	}
}
