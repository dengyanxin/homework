class Outer{
	static class StaticInner{
		public void show(){
			System.out.println("静态内部类实例方法");
		}
		public static void staticshow(){
			System.out.println("静态内部类静态方法");
		}
	}
}
public class Waijingtailei{
	public static void main(String[] arges){
		Outer.StaticInner.staticshow();//调用静态内部类静态方法
		new Outer.StaticInner().show();//调用静态内部类实例方法
	}
}