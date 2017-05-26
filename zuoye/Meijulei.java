//枚举类
enum Colors{
	red,green,blue;
	public String toString(){
		String ret = super.toString();
		switch (this){
		case red:
			ret = "红色";
			break;
		case green:
			ret = "绿色";
			break;
		case blue:
			ret = "蓝色";
			break;
		default:
			ret = "没有这个颜色";
		}
		return ret;
	}
}
public class Meijulei{
	public static void main(String[] arges){
		Colors[] cs = Colors.values();
		for(int i=0;i<cs.length;i++){
			System.out.println(cs[i]);
		}
	}
}
//枚举类的构造方法
/*
public class Meijulei{
	public static void main(String[] args){
		EnumDemo ed = EnumDemo.B;
		System.out.println(ed);
		System.out.println(ed.name());// 返回枚举实例名称;
		System.out.println(ed.ordinal());// 返回枚举实例在枚举类中的索引,从0开始;
		EnumDemo[] arrayED = ed.values();//数组类枚举
		for (int i = 0;i<arrayED.length ;i++ ){
			System.out.println(arrayED[i]);
		}
	}
}

enum EnumDemo{
	ON,OFF,A,B;
}
*/

/*
//枚举类实现接口
public class Meijulei{
	public static void main(String[] arges){
		color.red.show();
	}
}
interface I{
	void show();
}
enum color implements I{
	red{
		public void show(){
			System.out.println("红色");
		} 
	},green{
		public void show(){
			System.out.println("绿色");
		} 
	},blue{
		public void show(){
			System.out.println("蓝色");
		} 
	}
}
*/


//枚举类的单例模式
/*
public class Meijulei{
	public static void main(String[] arges){
		Singleton.getInstance().print();
	}
}
enum Singleton{
	Instance;//唯一实例
	public void print(){
		System.out.println("使用enum实现单利模式");
	}
	public static Singleton getInstance(){
		return Instance;
	}
}
*/