public class Huocheluru{
	public static void main(String[] arges){
		Huoche[] a=new Huoche[2];
		
		Huoche b=new Huoche("������","�����г�","�Ϻ�","2017-3-1","����","2017-3-2");
		a[0]=b;
		Huoche c=new Huoche("������","�糵","����","2017-3-3","����","2017-3-4");
		a[1]=c;

		for(int i=0;i<a.length;i++){
			a[i].say();
		}
	}
}