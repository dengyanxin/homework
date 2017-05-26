public class Diannaoluru{
	public static void main(String[] arges){
		Diannao[] a=new Diannao[4];
		Diannao b=new Diannao("华硕","笔记本",15,'有');
		a[0]=b;
		Diannao c=new Diannao("联想","台式",16,'无');
		a[1]=c;
		Diannao d=new Diannao("苹果","笔记本",15,'有');
		a[2]=d;
		Diannao e=new Diannao("神州","笔记本",14,'无');
		a[3]=e;
		for(int i=0;i<a.length;i++){
			a[i].say();
		}
	}
}