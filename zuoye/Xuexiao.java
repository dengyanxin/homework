public class Xuexiao{
	String name;//学校姓名
	String xing;//学校类型
	String xue;//学校学费
	public Xuexiao(String name,String xing,String xue){
		this.name=name;
		this.xing=xing;
		this.xue=xue;
	}
	public void say(){
		System.out.println("学校姓名:"+name+"  学校类型:"+xing+"   学校学费:"+xue);
	}
}