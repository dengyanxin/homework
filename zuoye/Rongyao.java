public class Rongyao{
	String name;//英雄姓名
	String xing;//英雄类型
	int xue;//英雄血量
	String neng;//英雄技能
	public Rongyao(String name,String xing,int xue,String neng){
		this.name=name;
		this.xing=xing;
		this.xue=xue;
		this.neng=neng;
	}
	public void say(){
		System.out.println("英雄姓名:"+name+"  英雄类型:"+xing+"  英雄血量:"+xue+"  英雄技能:"+neng);
	}
}