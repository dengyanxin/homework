public class yinyong{
	public static void main(String[] arges){
	int[] a={6,9};
	System.out.println("ǰ ��һ��="+a[0]+",�ڶ���="+a[1]);
	b(a,0,1);
	System.out.println("main ��һ��="+a[0]+",�ڶ���="+a[1]);
	}
	public static void b(int [] a,int x,int y){
		int t=a[x];
			a[x]=a[y];
			a[y]=t;
		System.out.println("��һ��="+a[0]+",�ڶ���="+a[1]);
	}
}