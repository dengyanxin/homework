public class yi100{
	public static void main(String[] arges){
		int a,b;
		a=1;
		for(b=0;b<=100;b++){
			a=a+b;
		}
		System.out.println("100以内整数和:"+a);
		for(b=0;b<=1000;b++){
			a=a+b;
		}
		System.out.println("1000以内整数和:"+a);
		for(b=0;b<=10000;b++){
			a=a+b;
		}
		System.out.println("10000以内整数和:"+a);
		for(b=0;b<=100000;b++){
			a=a+b;
		}
		System.out.println("100000以内整数和:"+a);
	}
}