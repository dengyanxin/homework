import java.util.Scanner;
public class Sanjiaoyichang{
	public static void main(String[] arges){
		Scanner sc = new Scanner(System.in);
	try{	
		System.out.println("�������һ���߳�");
		int a = sc.nextInt();
		System.out.println("������ڶ����߳�");
		int b = sc.nextInt();
		System.out.println("������������߳�");
		int c = sc.nextInt();
		try{
			if((a+b>c)&&(a+c)>b&&(b+c)>a){
				System.out.println("���Թ���������,���߷ֱ�Ϊ:");
				System.out.println("��һ���߳�:"+a+" �ڶ����߳�:"+b+" �������߳�:"+c);
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
		System.out.println("����������");
		dd.printStackTrace();
	}
	}
	private static Exception IllegalArgumentException(){
		System.out.println("���ܹ���������");
		return null;
	}
}