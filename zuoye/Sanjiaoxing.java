public class Sanjiaoxing extends Tuxing{
	public double a;
	public double b;
	public double c;
	public Sanjiaoxing(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void Zhouchang(){
		System.out.println("�����ε��ܳ���:"+(a+b+c));
	}
	public void Mianji(){
		System.out.println("�����ε������:"+((a*c)/2));
	}
}