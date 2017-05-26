//冒泡
import java.util.Scanner;
public class maopao{
	public static void main(String[] arges){
		System.out.println("请输入5个数:");
		int i,j,t;
		Scanner a=new Scanner(System.in);
		int[] n=new int[5];
		for(i=0;i<5;i++){
			n[i]=a.nextInt();
		}
		for(j=0;j<4;j++){
			for(i=0;i<4-j;i++){
				if(n[i]>n[i+1]){
					t=n[i];
					n[i]=n[i+1];
					n[i+1]=t;
				}
			}
		}
		System.out.println("排序之后:");
		for(i=0;i<5;i++){
			System.out.print(n[i]+"\t");
		}
	}
}