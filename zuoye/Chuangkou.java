package com.maipiao;

public class Chuangkou{
	private static Piao piao = new Piao("���ʵ�����",50);
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
				System.out.println("Ʊ����");
				switch(name){
				case "����1":
					System.out.println("����1����"+Chuangkou.a+"��Ʊ");
					System.out.println("С���򵽴���һ��Ʊ�ĸ���Ϊ"+((Chuangkou.a/50.0)*100)+"%");
					break;
				case "����2":
					System.out.println("����2����"+Chuangkou.b+"��Ʊ");break;
				case "����3":
					System.out.println("����3����"+Chuangkou.c+"��Ʊ");break;
				}
				break;
			}
			switch(name){
			case "����1":a+=1;break;
			case "����2":b+=1;break;
			case "����3":c+=1;break;
			}
			System.out.println(name+"�����˵�"+number+"��Ʊ");
			
		}
		System.out.println("С���򵽴���һ��Ʊ�ĸ���Ϊ"+((1.0/3)*((Chuangkou.a/50.0)*100))+"%");	
		
	}
}
