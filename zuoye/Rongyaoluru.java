import java.util.*;
public class Rongyaoluru{
	static Rongyao[] n=new Rongyao[100];
	static Scanner a=new Scanner(System.in);
	static int i=0;
	public static void main(String[] arges){
		while(true){
			System.out.println("请输入英雄姓名:");
			String name=a.next();
			System.out.println("请输入英雄类型:");
			String xing=a.next();
			System.out.println("请输入英雄血量:");
			int xue=a.nextInt();
			System.out.println("请输入英雄技能:");
			String neng=a.next();
			Rongyao b=new Rongyao(name,xing,xue,neng);
			n[i]=b;
			i++;
			for(int i = 0;i<n.length;i++){
				if(n[i]!=null){
					n[i].say();
				} 
			}
		}	
	}
}