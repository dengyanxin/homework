
/*
//����һ:
import java.util.*;
public class jisuanjixuanze{
	public static void main(String[] xuan){
		System.out.print("������������:");
		Scanner ji = new Scanner(System.in);
		double a=ji.nextDouble();
		String ch=ji.next();
		double b=ji.nextDouble();
		switch (ch){
		case "+":System.out.print("��Ϊ:"+(a+b)+"\n");break;
		case "-":System.out.print("��Ϊ:"+(a-b)+"\n");break;
		case "*":System.out.print("��Ϊ:"+(a*b)+"\n");break;
		case "/":System.out.print("��Ϊ:"+(a/b)+"\n");break;
		case "%":System.out.print("ȡ��Ϊ:"+(a%b)+"\n");break;
		}				
	}
}
*/

//������
import java.util.*;
public class jisuanjixuanze{
	public static void main(String[] xuan){
		System.out.print("������������:");
		Scanner ji = new Scanner(System.in);
		while(true){
			    double a=ji.nextDouble();
				String ch=ji.next();
				double b=ji.nextDouble();
				while(true){
				if("+".equals(ch)){
					System.out.print("��Ϊ:"+(a+b)+"\n");
				break;
				}else if("-".equals(ch)){
					System.out.print("��Ϊ:"+(a-b)+"\n");
				break;
				}else if("*".equals(ch)){
					System.out.print("��Ϊ:"+(a*b)+"\n");
				break;
				}else if("/".equals(ch)){
					System.out.print("��Ϊ:"+(a/b)+"\n");
				break;
				}
			}		
		}			
	}
}



