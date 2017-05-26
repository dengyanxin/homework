package com.maipiao;

public class Chuangkou{
	private static Piao piao = new Piao("临沂到济南",50);
	private String name;
	static int a=0;
	static int b=0;
	static int c=0;
	public Chuangkou(int number,String name){
		this.name=name;
	}
	
	public void sale(){
		while(true){
			int number=piao.getNumber();
			number--;
			piao.setNumber(number);
			if(number<1){
				System.out.println("票售罄");
				switch(name){
				case "窗口1":
					System.out.println("窗口1卖了"+Chuangkou.a+"张票");
					System.out.println("小明买到窗口一的票的概率为"+((Chuangkou.a/50.0)*100)+"%");
					break;
				case "窗口2":
					System.out.println("窗口2卖了"+Chuangkou.b+"张票");break;
				case "窗口3":
					System.out.println("窗口3卖了"+Chuangkou.c+"张票");break;
				}
				break;
			}
			switch(name){
			case "窗口1":a+=1;break;
			case "窗口2":b+=1;break;
			case "窗口3":c+=1;break;
			}
			System.out.println(name+"卖出了第"+number+"张票");
			
		}
		System.out.println("小明买到窗口一的票的概率为"+((1.0/3)*((Chuangkou.a/50.0)*100))+"%");	
		
	}
}
