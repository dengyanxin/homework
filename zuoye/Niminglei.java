abstract class AbstractSuper{
	public abstract void show();
}
interface Inter{
	void show();
}
public class Niminglei{
	//�÷�����Ҫ����AbstractSuper���������
	public static void test1(AbstractSuper as){
		as.show();
	}
	//�÷�����Ҫ����Inter��ʵ�������
	public static void main(String[] arges){
		final String finalProp = "�ֲ�����";
		test1(new AbstractSuper()){
			public void show(){
				System.out.println(finalProp);//�ڲ���ֻ�ܷ���final���εľֲ�����
				System.out.println("�����������ڲ���");
			}
		}
		test2(new Inter()){
			public void show(){
				System.out.println("�ӿ������ڲ���");
			}
		}
	}
}