//ö����
enum Colors{
	red,green,blue;
	public String toString(){
		String ret = super.toString();
		switch (this){
		case red:
			ret = "��ɫ";
			break;
		case green:
			ret = "��ɫ";
			break;
		case blue:
			ret = "��ɫ";
			break;
		default:
			ret = "û�������ɫ";
		}
		return ret;
	}
}
public class Meijulei{
	public static void main(String[] arges){
		Colors[] cs = Colors.values();
		for(int i=0;i<cs.length;i++){
			System.out.println(cs[i]);
		}
	}
}
//ö����Ĺ��췽��
/*
public class Meijulei{
	public static void main(String[] args){
		EnumDemo ed = EnumDemo.B;
		System.out.println(ed);
		System.out.println(ed.name());// ����ö��ʵ������;
		System.out.println(ed.ordinal());// ����ö��ʵ����ö�����е�����,��0��ʼ;
		EnumDemo[] arrayED = ed.values();//������ö��
		for (int i = 0;i<arrayED.length ;i++ ){
			System.out.println(arrayED[i]);
		}
	}
}

enum EnumDemo{
	ON,OFF,A,B;
}
*/

/*
//ö����ʵ�ֽӿ�
public class Meijulei{
	public static void main(String[] arges){
		color.red.show();
	}
}
interface I{
	void show();
}
enum color implements I{
	red{
		public void show(){
			System.out.println("��ɫ");
		} 
	},green{
		public void show(){
			System.out.println("��ɫ");
		} 
	},blue{
		public void show(){
			System.out.println("��ɫ");
		} 
	}
}
*/


//ö����ĵ���ģʽ
/*
public class Meijulei{
	public static void main(String[] arges){
		Singleton.getInstance().print();
	}
}
enum Singleton{
	Instance;//Ψһʵ��
	public void print(){
		System.out.println("ʹ��enumʵ�ֵ���ģʽ");
	}
	public static Singleton getInstance(){
		return Instance;
	}
}
*/