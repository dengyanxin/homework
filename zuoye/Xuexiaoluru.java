import java.util.*;
public class Xuexiaoluru{
	public static void main(String[] arges){
		while(true){
		Xuexiao[] n=new Xuexiao[1];
		Scanner a=new Scanner(System.in);
		for(int i=0;i<1;i++){
			System.out.println("������ѧУ����:");
			String name=a.next();
			System.out.println("������ѧУ����:");
			String xing=a.next();
			System.out.println("������ѧУѧ��:");
			String xue=a.next();
			Xuexiao b=new Xuexiao(name,xing,xue);
			n[i]=b;
			}
			for(int i = 0;i<n.length;i++){
				 n[i].say();
			}
		}	
	}
}