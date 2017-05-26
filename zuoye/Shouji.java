public class Shouji{
	String name;//手机品牌
	int money;//手机多少钱
	public Shouji(String name,int money){
		this.name=name;
		this.money=money;
	}
	public void say(){
		System.out.println("手机品牌:"+name+"  钱:"+money);
	}
}