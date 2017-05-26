public class Jiaoshiluru{
	public static void main(String[] arges){
		Jiaoshi[] a=new Jiaoshi[4];
		Jiaoshi b=new Jiaoshi("刘金涛",20,'男',"商务系","java");
		a[0]=b;
		Jiaoshi c=new Jiaoshi("卢祥军",20,'男',"商务系","c语言");
		a[1]=c;
		Jiaoshi d=new Jiaoshi("高艳真",20,'女',"商务系","ps");
		a[2]=d;
		Jiaoshi e=new Jiaoshi("倪宝山",20,'男',"商务系","php");
		a[3]=e;
		for(int i=0;i<a.length;i++){
			a[i].say();
		}
	}
}