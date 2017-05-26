public class Chaoshi{
	String name;//商品名称
	String xing;//商品类型
	int money;//商品价格
	public Chaoshi(String name,String xing,int money){
		this.name=name;
		this.xing=xing;
		this.money=money;
	}
	public void say(){
		System.out.println("商品名称为:"+name+"    商品类型为:"+xing+"    商品价格为"+money);
	}
}