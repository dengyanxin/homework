public class Jiaoshiluru{
	public static void main(String[] arges){
		Jiaoshi[] a=new Jiaoshi[4];
		Jiaoshi b=new Jiaoshi("������",20,'��',"����ϵ","java");
		a[0]=b;
		Jiaoshi c=new Jiaoshi("¬���",20,'��',"����ϵ","c����");
		a[1]=c;
		Jiaoshi d=new Jiaoshi("������",20,'Ů',"����ϵ","ps");
		a[2]=d;
		Jiaoshi e=new Jiaoshi("�߱�ɽ",20,'��',"����ϵ","php");
		a[3]=e;
		for(int i=0;i<a.length;i++){
			a[i].say();
		}
	}
}