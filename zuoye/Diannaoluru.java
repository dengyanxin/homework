public class Diannaoluru{
	public static void main(String[] arges){
		Diannao[] a=new Diannao[4];
		Diannao b=new Diannao("��˶","�ʼǱ�",15,'��');
		a[0]=b;
		Diannao c=new Diannao("����","̨ʽ",16,'��');
		a[1]=c;
		Diannao d=new Diannao("ƻ��","�ʼǱ�",15,'��');
		a[2]=d;
		Diannao e=new Diannao("����","�ʼǱ�",14,'��');
		a[3]=e;
		for(int i=0;i<a.length;i++){
			a[i].say();
		}
	}
}