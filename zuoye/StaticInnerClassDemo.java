class Outer{
	class Inner{
		public void show(){
			System.out.println("�Ǿ�̬�ڲ��෽��");
		}
	}
}
public class StaticInnerClassDemo{
	public static void main(String[] arges){
		Outer out=new Outer();//�����ⲿ�����
		Outer.Inner in=out.new Inner();//�����ⲿ����󴴽��ڲ������
		in.show();
	}
}