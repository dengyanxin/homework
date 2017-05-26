import java.util.*;
public class jisuanji{
	public static void main(String[] jisuan){
		System.out.println("请输入两个数:");
		int a,b;
		double[] c=new double[2];
		Scanner ji=new Scanner(System.in);
		for(a=0;a<2;a++){
				c[a]=ji.nextDouble();
		}
				System.out.print("和为:"+(c[0]+c[1])+"\n");
				System.out.print("减为:"+(c[0]-c[1])+"\n");
				System.out.print("乘为:"+(c[0]*c[1])+"\n");
				System.out.print("除为:"+(c[0]/c[1])+"\n");
	}
}


/*
import java.util.*;
public class jisuanjixuanze{
	public static void main(String[] xuan){
		System.out.print("请输入两个数:");
		Scanner ji=new Scanner(System.in);
		double a=ji.nextDouble();
		double b=ji.nextDouble();
			    System.out.print("和为:"+(a+b)+"\n");	
				System.out.print("减为:"+(a-b)+"\n");
				System.out.print("乘为:"+(a*b)+"\n");
				System.out.print("除为:"+(a/b)+"\n");
	}
}
*/