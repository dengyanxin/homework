//适配器
/*
public class Shipeiqi{
	public static void main(String[] arges){
		Mywindow d=new Mywindow();
		d.close();
	}
}
interface Iwindow{
	void max();
	void min();
	void close();
}
abstract class WindowsAdapter implements Iwindow{
	public void max(){}
	public void min(){}
	public void close(){}
}
class Mywindow extends WindowsAdapter{
	public void close(){
		System.out.println("只修改关闭");
	}	
}
*/



public class Shipeiqi{
	public static void main(String[] arges){
		Mywindow b=new Mywindow();
		b.close();
	}
}
interface Iwindow{
	void max();
	void min();
	void close();
}
abstract class Windows implements Iwindow{
	public void max(){};
	public void min(){};
	public void close(){};
}
class Mywindow extends Windows{
	public void close(){
		System.out.println("只修改关闭");
	}
}



