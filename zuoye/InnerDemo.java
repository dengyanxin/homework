public class InnerDemo {
	public static void main(String[] args) {
		//Outer.Inner in = new Outer().new Inner();
		Outer.Inner in;
		Outer out = new Outer();
		in = out.new Inner();
		in.inShow();
		//Outer out = new Outer();
		//out.outShow();
	}
}

class Outer {
	class Inner {
		public void inShow() {
			System.out.println("inShow");
		}
	}
	public void outShow(){
		//System.out.println("outShow");
		Inner in = new Inner();
		in.inShow();
	}
}
