package com.yanxin;
import java.util.*;
public class Jianzibaofu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//规则:剪子大于包袱,包袱大于锤,锤大于剪子。
		//剪子:1
		//包袱:2
		//锤子:3
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要出的数,1为剪子,2为包袱,3为锤子");
		int a = sc.nextInt();
		int i = ((int)(Math.random()*3+1));
		if(i==1){
			System.out.println("电脑出剪刀");
		}else if(i==2){
			System.out.println("电脑出包袱");
		}else if(i==3){
			System.out.println("电脑出锤子");
		}
		if(a==1){
			System.out.println("你出剪刀");
		}else if(a==2){
			System.out.println("你出包袱");
		}else if(a==3){
			System.out.println("你出锤子");
		}
		if(a==i){
			System.out.println("平局");
		}else if(a==1&&i==2){
			System.out.println("您赢了");
		}else if(a==1&&i==3){
			System.out.println("电脑赢了");
		}else if(a==2&&i==1){
			System.out.println("电脑赢了");
		}else if(a==2&&i==3){
			System.out.println("你赢了");
		}else if(a==3&&i==1){
			System.out.println("你赢了");
		}else if(a==3&&i==2){
			System.out.println("电脑赢了");
		}
	}
}
