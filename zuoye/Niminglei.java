abstract class AbstractSuper{
	public abstract void show();
}
interface Inter{
	void show();
}
public class Niminglei{
	//该方法需要接受AbstractSuper的子类对象
	public static void test1(AbstractSuper as){
		as.show();
	}
	//该方法需要接受Inter的实现类对象
	public static void main(String[] arges){
		final String finalProp = "局部变量";
		test1(new AbstractSuper()){
			public void show(){
				System.out.println(finalProp);//内部类只能访问final修饰的局部变量
				System.out.println("抽象类匿名内部类");
			}
		}
		test2(new Inter()){
			public void show(){
				System.out.println("接口匿名内部类");
			}
		}
	}
}
