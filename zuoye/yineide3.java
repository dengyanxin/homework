public class yineide3{
	public static void main(String[] arges){
		int a,j=0;
		System.out.println("100以内是3的倍数的数有:");
		for(a=1;a<100;a++){
			if(a%3==0){
			System.out.print(a+"\t");
			j++;
			}
		}
		System.out.print("100以内3的倍数个数为:"+j);
	}
}