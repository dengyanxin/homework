public class Diannao{
	String pin;//电脑品牌
	String xing;//电脑类型
	int cun;//电脑尺寸
	char pan;//有无固态硬盘
	public Diannao(String pin,String xing,int cun,char pan){
		this.pin=pin;
		this.xing=xing;
		this.cun=cun;
		this.pan=pan;
	}
	public void say(){
		System.out.println("电脑品牌:"+pin+" 电脑类型:"+xing+" 电脑尺寸"+cun+"存"+" 有无固态硬盘:"+pan);
	}
}