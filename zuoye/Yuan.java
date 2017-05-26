public class Yuan extends Tuxing{
	public double r;
	public Yuan(double r){
		this.r=r;
	}
	public void Zhouchang() {
		System.out.println("圆的周长:"+Math.PI*r*2);
	}
	public void Mianji() {
		System.out.println("圆的面积:"+Math.PI*r*r);
	}
}