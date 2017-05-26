
/*
//方法一:
import java.util.*;
public class jisuanjixuanze{
	public static void main(String[] xuan){
		System.out.print("请输入两个数:");
		Scanner ji = new Scanner(System.in);
		double a=ji.nextDouble();
		String ch=ji.next();
		double b=ji.nextDouble();
		switch (ch){
		case "+":System.out.print("和为:"+(a+b)+"\n");break;
		case "-":System.out.print("减为:"+(a-b)+"\n");break;
		case "*":System.out.print("乘为:"+(a*b)+"\n");break;
		case "/":System.out.print("除为:"+(a/b)+"\n");break;
		case "%":System.out.print("取余为:"+(a%b)+"\n");break;
		}				
	}
}
*/

//方法二
import java.util.*;
public class jisuanjixuanze{
	public static void main(String[] xuan){
		System.out.print("请输入两个数:");
		Scanner ji = new Scanner(System.in);
		while(true){
			    double a=ji.nextDouble();
				String ch=ji.next();
				double b=ji.nextDouble();
				while(true){
				if("+".equals(ch)){
					System.out.print("和为:"+(a+b)+"\n");
				break;
				}else if("-".equals(ch)){
					System.out.print("减为:"+(a-b)+"\n");
				break;
				}else if("*".equals(ch)){
					System.out.print("乘为:"+(a*b)+"\n");
				break;
				}else if("/".equals(ch)){
					System.out.print("除为:"+(a/b)+"\n");
				break;
				}
			}		
		}			
	}
}



