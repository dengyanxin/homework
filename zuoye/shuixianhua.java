public class shuixianhua{
	public static void main(String[] xianhua){
		int a,b,c,d;
			for(d=100;d<1000;d++){
					a=d/100;
					b=(d-a*100)/10;
					c=d%10;
					if(a*a*a+b*b*b+c*c*c==d){
						System.out.print("\t"+d);
					}
			}
	}
}