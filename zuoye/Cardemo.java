package com.yanxin;
import java.util.*;
public class Cardemo {
	static Scanner sc = new Scanner(System.in);
	static Car[] a = new Car[6];
	public static void main(String[] args) {
		Welcome();
	}
	public static void Welcome(){
		System.out.println("*****��ӭʹ���⳵ϵͳ��*****");
		System.out.println("*****��ȷ���⳵��*****");
		System.out.println("�ǣ�������1��          ��������2��");
		int flag = sc.nextInt();
		if(flag==1){
			System.out.println("****�����⳵�����ͼ���Ŀ��****");
			a[0] = new Zaikeche(1,"��������",1000,4);
			a[1] = new Zaikeche(2,"��˹��˹",2000,4);
			a[2] = new Zaikeche(3,"������",3000,4);
			a[3] = new Zaihuoche(4,"���J6",800,5);
			a[4] = new Zaihuoche(5,"��������",700,4);
			a[5] = new Zaihuoche(6,"�������",500,2);
			System.out.println("���"+"\t"+"��������"+"\t"+"�����"+"\t"+"������"+"\t"+"�ػ�����");
			for(int i=0;i<a.length;i++){

				System.out.println((i+1)+"\t"+a[i].getname()+"\t"+a[i].getmoney()+"\t"+a[i].getzaike()+"\t"+a[i].getzaihuo());
			}
		}else{
			System.out.println("****��л���Ļݹˣ���ӭ�ٴι��٣�****");
		}
		System.out.println("****�����������⳵������****");
		int zucheliang = sc.nextInt();
		Car[] zuCar = new Car[zucheliang];
		
		for(int i=1;i<=zucheliang;i++){
			System.out.println("****�������"+i+"�����****");
			int xuhao = sc.nextInt();
			zuCar[i-1] = a[xuhao-1];
		}
		System.out.println("****������������****");
		int day = sc.nextInt();
		System.out.println("****�����˵���****");
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
				System.out.println("�ػ���:\t"+zuCar[i].getname());
			}
			if(zuCar[i].getzaike() != 0){
				System.out.println("�ؿͳ�:\t"+zuCar[i].getname());
			}
		}
		System.out.println("���ؿ�:"+num_zaike+"��");
		System.out.println("���ػ�:"+num_zaihuo+"��");
		System.out.println("�⳵�ܼ۸�:"+zucheliang*num_money*day+"Ԫ");
	}
}
