public class Neibulei{
	public static void main(String[] arges){
		new Snake().show();
	}
}
class Snake{
	private String name="�ⲿ������";
	private class Nodes{
		private String name="�ڲ�������";
		public void add2Tail(){
			String name="�ֲ�����";
			System.out.println("��"+name+"��ӵ�β��");
			System.out.println("��"+this.name+"��ӵ�β��");
			System.out.println("��"+Snake.this.name+"��ӵ�β��");
		}
	}
	public void show(){
		new Nodes().add2Tail();
	}
}
