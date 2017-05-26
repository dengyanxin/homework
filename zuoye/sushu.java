import java.util.*;
public class sushu{
	public static void main(String[] sushu){
		Scanner su =new Scanner(System.in);
		int a=su.nextInt();
		int i,b;
					b=1;
					for(i=2;i<a;i++){
						if(a%i==0){
							b=0;
							break;
						}
					}
					if(b==1){
						System.out.print(a+"是素数\t");
					}else{
						System.out.print(a+"不是素数\t");
					}
			}
	}