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
		System.out.println("�������");
	}
}
class jianpan implements USB{
	public void useUSB(){
		System.out.println("���Ǽ���");
	}
}










/*
interface USB{
	void useUSB();
}
class shubiao implements USB{
	public void useUSB(){
		System.out.println("�������");
	}
}
class jianpan implements USB{
	public void useUSB(){
		System.out.println("���Ǽ���");
	}
}
public class Jiekou{
	public static void main(String[] arges){
		USB s=new shubiao();
		s.useUSB();
	}
}
*/











