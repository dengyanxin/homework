import java.util.*;
public class jisuanji{
	public static void main(String[] jisuan){
		System.out.println("������������:");
		int a,b;
		double[] c=new double[2];
		Scanner ji=new Scanner(System.in);
		for(a=0;a<2;a++){
				c[a]=ji.nextDouble();
		}
				System.out.print("��Ϊ:"+(c[0]+c[1])+"\n");
				System.out.print("��Ϊ:"+(c[0]-c[1])+"\n");
				System.out.print("��Ϊ:"+(c[0]*c[1])+"\n");
				System.out.print("��Ϊ:"+(c[0]/c[1])+"\n");
	}
}


/*
import java.util.*;
public class jisuanjixuanze{
	public static void main(String[] xuan){
		System.out.print("������������:");
		Scanner ji=new Scanner(System.in);
		double a=ji.nextDouble();
		double b=ji.nextDouble();
			    System.out.print("��Ϊ:"+(a+b)+"\n");	
				System.out.print("��Ϊ:"+(a-b)+"\n");
				System.out.print("��Ϊ:"+(a*b)+"\n");
				System.out.print("��Ϊ:"+(a/b)+"\n");
	}
}
*/