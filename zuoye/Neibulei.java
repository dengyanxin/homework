public class Neibulei{
	public static void main(String[] arges){
		new Snake().show();
	}
}
class Snake{
	private String name="外部类属性";
	private class Nodes{
		private String name="内部类属性";
		public void add2Tail(){
			String name="局部变量";
			System.out.println("把"+name+"添加到尾巴");
			System.out.println("把"+this.name+"添加到尾巴");
			System.out.println("把"+Snake.this.name+"添加到尾巴");
		}
	}
	public void show(){
		new Nodes().add2Tail();
	}
}
