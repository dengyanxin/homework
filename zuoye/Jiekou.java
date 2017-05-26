public class Jiekou{
	public static void main(String[] arges){
		USB s = new jianpan();
		s.useUSB();
	}
}
interface USB{
	void useUSB();
}
class shubiao implements USB{
	public void useUSB(){
		System.out.println("我是鼠标");
	}
}
class jianpan implements USB{
	public void useUSB(){
		System.out.println("我是键盘");
	}
}










/*
interface USB{
	void useUSB();
}
class shubiao implements USB{
	public void useUSB(){
		System.out.println("我是鼠标");
	}
}
class jianpan implements USB{
	public void useUSB(){
		System.out.println("我是键盘");
	}
}
public class Jiekou{
	public static void main(String[] arges){
		USB s=new shubiao();
		s.useUSB();
	}
}
*/











