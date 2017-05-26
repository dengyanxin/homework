public class Jiuneibulei{
	String name = "will";
	public static void main(String[] arges){
		new Jiuneibulei().show();
	}
	public void show(){
		final int num = 10;//final修饰局部变量
		class Local{//局部内部类
			public void test(){
				System.out.println(name + "----->" + num);
			}
		}
		new Local().test();//调用
	}
}