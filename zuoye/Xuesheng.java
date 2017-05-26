//学生类
public class Xuesheng{
	String name;//姓名
	int age;//年龄
	char sex;//性别

    public Xuesheng(String name,int age,char sex){
        //this 表示当前类本身。
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void say(){
        System.out.println("我叫"+name+" 今年"+age+"岁 "+"我是"+sex+"孩儿");
    }
}
