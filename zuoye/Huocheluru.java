public class Huocheluru{
	public static void main(String[] arges){
		Huoche[] a=new Huoche[2];
		
		Huoche b=new Huoche("钢铁侠","高速列车","上海","2017-3-1","临沂","2017-3-2");
		a[0]=b;
		Huoche c=new Huoche("蝙蝠侠","电车","北京","2017-3-3","临沂","2017-3-4");
		a[1]=c;

		for(int i=0;i<a.length;i++){
			a[i].say();
		}
	}
}