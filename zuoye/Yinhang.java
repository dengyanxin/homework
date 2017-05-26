public class Yinhang{
	public String name;//存款人姓名
	private String mima;//存款人密码
	public int money;//存取的金额
	public Yinhang(String name,String mima,int money){
		this.name=name;
		this.mima=mima;
		this.money=money;
	} 
	public void say(){
		System.out.println("存款人姓名:"+name+"    存款人密码:"+mima+"    存取的金额:"+money);
	}
}