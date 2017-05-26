import java.util.*;
public class Shoujiluru{
	public static void main(String[] arges){
		Shouji[] n=new Shouji[2];
		Scanner a=new Scanner(System.in);
		for(int i=0;i<2;i++){
			System.out.println("请输入一个手机品牌:");
			String name=a.next();
			System.out.println("请输入一个手机价钱:");
			int money=a.nextInt();
			Shouji b=new Shouji(name,money);
			n[i]=b;
		}
		for(int i = 0;i<n.length;i++){
            n[i].say();
        }
	}
}