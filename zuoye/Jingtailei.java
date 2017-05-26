class Outer{
	private String name="will";
	private static int age=17;

	static class StaticInner{
		private String s="ooxx";
		private static int num=13;

		public void show(){
			System.out.println(age);
			System.out.println(new Outer().name);
		}
	}

	public void test(){
		System.out.println(StaticInner.num);
		System.out.println(new StaticInner().s);
		new StaticInner().show();
	}
}
public class Jingtailei{
	public static void main(String[] arges){
		new Outer().test();
	}
} 