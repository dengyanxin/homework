public class hanshu{
	public static void main(String[] arges){
		int a,b;
		a=10;
		b=3;
		int aa=shu(a,b);
		System.out.println(aa);
		int c,d;
		c=2;
		d=5;
		int cc=shu(c,d);
		System.out.println(cc);
		int dd=shu(aa,cc);
		System.out.println(dd);
	}
	public static int shu(int x,int y){
		System.out.print(x+","+y+"最大值是:");
		if(x>y){
		return x;
		}else{
		return y;
		}
	}
}