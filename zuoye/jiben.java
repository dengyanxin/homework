public class jiben{
	public static void main(String[] arges){
		int a=12;
		int	b=24;
		c(a,b);
		System.out.println("a="+a+",b="+b);
	}
	public static void c(int x,int y){
		int t=x;
		x=y;
		y=t;
		System.out.println("x="+x+",y="+y);
	}
}