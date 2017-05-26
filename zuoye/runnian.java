public class runnian{
	public static void main(String[] runnian){
		int i;
		for(i=2000;i<2500;i++){
				if((i%4==0 && i%100!=0)||i%400==0){
				System.out.print("\t"+i);
			}
		}
		
	}
}