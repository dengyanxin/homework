import java.util.*;
public class Tumain{
	public static void main(String[] arges){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入长度:");
		double a=sc.nextDouble();
		System.out.println("请输入宽度:");
		double b=sc.nextDouble();
		System.out.println("请输入高度:");
		double c=sc.nextDouble();
		System.out.println("请输入半径:");
		double r=sc.nextDouble();
		Sanjiaoxing s = new Sanjiaoxing(a,b,c);
		s.Zhouchang();
		s.Mianji();
		Yuan y = new Yuan(r);
		y.Zhouchang();
		y.Mianji();
	}
}