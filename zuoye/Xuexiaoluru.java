import java.util.*;
public class Xuexiaoluru{
	public static void main(String[] arges){
		while(true){
		Xuexiao[] n=new Xuexiao[1];
		Scanner a=new Scanner(System.in);
		for(int i=0;i<1;i++){
			System.out.println("请输入学校姓名:");
			String name=a.next();
			System.out.println("请输入学校类型:");
			String xing=a.next();
			System.out.println("请输入学校学费:");
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