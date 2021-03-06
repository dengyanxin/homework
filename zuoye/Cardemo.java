package com.yanxin;
import java.util.*;
public class Cardemo {
	static Scanner sc = new Scanner(System.in);
	static Car[] a = new Car[6];
	public static void main(String[] args) {
		Welcome();
	}
	public static void Welcome(){
		System.out.println("*****欢迎使用租车系统！*****");
		System.out.println("*****您确认租车吗？*****");
		System.out.println("是（请输入1）          否（请输入2）");
		int flag = sc.nextInt();
		if(flag==1){
			System.out.println("****您可租车的类型及价目表****");
			a[0] = new Zaikeche(1,"兰博基尼",1000,4);
			a[1] = new Zaikeche(2,"劳斯莱斯",2000,4);
			a[2] = new Zaikeche(3,"法拉利",3000,4);
			a[3] = new Zaihuoche(4,"解放J6",800,5);
			a[4] = new Zaihuoche(5,"东风天龙",700,4);
			a[5] = new Zaihuoche(6,"福田奥铃",500,2);
			System.out.println("序号"+"\t"+"汽车名称"+"\t"+"日租金"+"\t"+"载人量"+"\t"+"载货数量");
			for(int i=0;i<a.length;i++){

				System.out.println((i+1)+"\t"+a[i].getname()+"\t"+a[i].getmoney()+"\t"+a[i].getzaike()+"\t"+a[i].getzaihuo());
			}
		}else{
			System.out.println("****感谢您的惠顾，欢迎再次光临！****");
		}
		System.out.println("****请输入您的租车数量：****");
		int zucheliang = sc.nextInt();
		Car[] zuCar = new Car[zucheliang];
		
		for(int i=1;i<=zucheliang;i++){
			System.out.println("****请输入第"+i+"的序号****");
			int xuhao = sc.nextInt();
			zuCar[i-1] = a[xuhao-1];
		}
		System.out.println("****请输入天数：****");
		int day = sc.nextInt();
		System.out.println("****您的账单：****");
		int num_zaike = 0;
		int num_zaihuo = 0;
		int num_money = 0;
		
		for(int i=0;i<zuCar.length;i++){
			num_zaike = num_zaike+zuCar[i].getzaike();
			num_zaihuo = num_zaihuo+zuCar[i].getzaihuo();
			num_money = num_money+zuCar[i].getmoney();
		}
		for(int i=0;i<zucheliang;i++){
			if(zuCar[i].getzaihuo() != 0){
				System.out.println("载货车:\t"+zuCar[i].getname());
			}
			if(zuCar[i].getzaike() != 0){
				System.out.println("载客车:\t"+zuCar[i].getname());
			}
		}
		System.out.println("共载客:"+num_zaike+"人");
		System.out.println("共载货:"+num_zaihuo+"吨");
		System.out.println("租车总价格:"+zucheliang*num_money*day+"元");
	}
}
