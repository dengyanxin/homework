//火车类
public class Huoche{
	String name;//火车名
	String leixing;//火车类型
	String cheng;//出发城市
	String jian;//发车时间
	String chengshi;//到达城市
	String shi;//到站时间
	public Huoche(String name,String leixing,String cheng,String jian,String chengshi,String shi){
		this.name=name;
		this.leixing=leixing;
		this.cheng=cheng;
		this.jian=jian;
		this.chengshi=chengshi;
		this.shi=shi;
	}
	public void say(){
		System.out.print("火车名是:"+name+" 火车类型是:"+leixing+" 出发城市是:"+cheng+" 发车时间是:"+jian+" 到达城市是:"+chengshi+" 到达时间是:"+shi+"\n");
	}
}