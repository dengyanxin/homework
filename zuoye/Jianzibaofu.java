package com.yanxin;
import java.util.*;
public class Jianzibaofu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����:���Ӵ��ڰ���,�������ڴ�,�����ڼ��ӡ�
		//����:1
		//����:2
		//����:3
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ������,1Ϊ����,2Ϊ����,3Ϊ����");
		int a = sc.nextInt();
		int i = ((int)(Math.random()*3+1));
		if(i==1){
			System.out.println("���Գ�����");
		}else if(i==2){
			System.out.println("���Գ�����");
		}else if(i==3){
			System.out.println("���Գ�����");
		}
		if(a==1){
			System.out.println("�������");
		}else if(a==2){
			System.out.println("�������");
		}else if(a==3){
			System.out.println("�������");
		}
		if(a==i){
			System.out.println("ƽ��");
		}else if(a==1&&i==2){
			System.out.println("��Ӯ��");
		}else if(a==1&&i==3){
			System.out.println("����Ӯ��");
		}else if(a==2&&i==1){
			System.out.println("����Ӯ��");
		}else if(a==2&&i==3){
			System.out.println("��Ӯ��");
		}else if(a==3&&i==1){
			System.out.println("��Ӯ��");
		}else if(a==3&&i==2){
			System.out.println("����Ӯ��");
		}
	}
}
