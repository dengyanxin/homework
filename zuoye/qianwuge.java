public class qianwuge{
	public static void main(String[] arges){
		int a,b=0;
		System.out.println("100����ǰ���3�ı���������:");
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