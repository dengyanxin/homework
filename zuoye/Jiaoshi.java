public class Jiaoshi{
	String name;//老师姓名
	int age;//年龄
	char sex;//性别
	String xi;//所在系
	String ke;//所教科目
	public Jiaoshi(String name,int age,char sex,String xi,String ke){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.xi=xi;
		this.ke=ke;
	}
	public void say(){
		System.out.println("老师名字:"+name+" 年龄:"+age+" 性别:"+sex+" 所在系:"+xi+" 所教科目:"+ke);
	}
}