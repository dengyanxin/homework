class Outer{
	static class StaticInner{
		public void show(){
			System.out.println("��̬�ڲ���ʵ������");
		}
		public static void staticshow(){
			System.out.println("��̬�ڲ��ྲ̬����");
		}
	}
}
public class Waijingtailei{
	public static void main(String[] arges){
		Outer.StaticInner.staticshow();//���þ�̬�ڲ��ྲ̬����
		new Outer.StaticInner().show();//���þ�̬�ڲ���ʵ������
	}
}