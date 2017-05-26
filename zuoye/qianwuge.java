public class qianwuge{
	public static void main(String[] arges){
		int a,b=0;
		System.out.println("100以内前五个3的倍数的数有:");
		for(a=1;a<100;a++){
			if(a%3==0){
			System.out.print(a+"\t");
			b++;
			}
			if(b==5){
				break;
			}
		}
	}
}