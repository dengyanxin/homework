public class Jiuneibulei{
	String name = "will";
	public static void main(String[] arges){
		new Jiuneibulei().show();
	}
	public void show(){
		final int num = 10;//final���ξֲ�����
		class Local{//�ֲ��ڲ���
			public void test(){
				System.out.println(name + "----->" + num);
			}
		}
		new Local().test();//����
	}
}