package com.yanxin;
//s=a+aa+aaa+aaaa;
//�ڶ���
public class Aaa {
	public static String show(Integer num,Integer count){
		//����
		String ele = "";
		//���ʽ
		String exp = "";
		long sum = 0;
		for(int i=1;i<count;i++){
			ele +=num;
			System.out.println("����="+ele);
			sum += new Integer(ele);
			exp += ele;
			if(i!=count){
				exp +="+";
			}else{
				exp +="=";
			}
		}
		return exp+sum;
	}
	public static void main(String[] arges){
		String ret = show(2, 4);
		System.out.println(ret);
	}
}
