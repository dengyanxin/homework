import java.util.*;
public class mima{
	public static void main(String[] arges){
		while(true){
		System.out.println("����������:");
		int i,l,m,n,z;
		Scanner p = new Scanner(System.in);
		String a=p.next();
		char[] k=new char[a.length()];
		for(i=0;i<a.length();i++){
			k[i] = a.charAt(i);
		}
		l=0;
		m=0;
		n=0;
		z=0;
		for(i=0;i<a.length();i++){
			if(k[i]>=48&&k[i]<=57){
				l=1;
			}else if(k[i]>=97&&k[i]<=122){
				m=1;
			}else if(k[i]>=33&&k[i]<=47){
				n=1;
			}else{
				z=1;
			}
		}
		System.out.println("����ǿ��:");
		if(l==1&&m==1&&n==1){
			System.out.println("ǿ");
		}else if((l==1&&m==1)||(l==1&&n==1)||(m==1&&n==1)){
			System.out.println("��");
		}else if(l==1||m==1||n==1){
			System.out.println("��");
		}else if(z==1){
			System.out.println("�������뺺��,����������");
		}
		}
	}
}
