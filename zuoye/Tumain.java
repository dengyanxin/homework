import java.util.*;
public class Tumain{
	public static void main(String[] arges){
		Scanner sc=new Scanner(System.in);
		System.out.println("�����볤��:");
		double a=sc.nextDouble();
		System.out.println("��������:");
		double b=sc.nextDouble();
		System.out.println("������߶�:");
		double c=sc.nextDouble();
		System.out.println("������뾶:");
		double r=sc.nextDouble();
		Sanjiaoxing s = new Sanjiaoxing(a,b,c);
		s.Zhouchang();
		s.Mianji();
		Yuan y = new Yuan(r);
		y.Zhouchang();
		y.Mianji();
	}
}