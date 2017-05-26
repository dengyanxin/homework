import java.util.Scanner;
public class Sanjiaoyichang{
	public static void main(String[] arges){
		Scanner sc = new Scanner(System.in);
	try{	
		System.out.println("请输入第一条边长");
		int a = sc.nextInt();
		System.out.println("请输入第二条边长");
		int b = sc.nextInt();
		System.out.println("请输入第三条边长");
		int c = sc.nextInt();
		try{
			if((a+b>c)&&(a+c)>b&&(b+c)>a){
				System.out.println("可以构成三角形,三边分别为:");
				System.out.println("第一条边长:"+a+" 第二条边长:"+b+" 第三条边长:"+c);
			}else{
				try{
					throw IllegalArgumentException();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
	}catch(Exception dd){
		System.out.println("请输入整数");
		dd.printStackTrace();
	}
	}
	private static Exception IllegalArgumentException(){
		System.out.println("不能构成三角形");
		return null;
	}
}