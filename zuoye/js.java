import java.util.Scanner;
public class js{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个数:");
		int a = sc.nextInt();
		char sign=sc.next().charAt(0);
		int b = sc.nextInt();
		int c;
		if(sign=='+'){
			c=a+b;
			System.out.println(c);
		}else if(sign=='-'){
			c=a-b;
			System.out.println(c);
		}else if(sign=='*'){
			c=a*b;
			System.out.println(c);
		}else if(sign=='/'){
			c=a/b;
			System.out.println(c);
		}
	}
}