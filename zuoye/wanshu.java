public class wanshu{
	public static void main(String[] wanshu){
			int i,j,k,m;
			for(i=1;i<1000;i++){
				k=0;
				for(j=1;j<i;j++){
					if(i%j==0){
						k=k+j;
					}
				}
				if(k==i){
					System.out.println(i+"是完数,因子是\t");
					for(m=1;m<i;m++){
					
					if(i%m==0){
							System.out.print("\t"+m);
						}
					}
					System.out.print("\n");
				}
			}
	}
}