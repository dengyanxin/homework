//超市菜单
import java.util.*;
public class Chaocaidan{
	static Scanner sc =new Scanner(System.in);
	static Chaoshi[] n=new Chaoshi[100];
	static int i=0;
	public static void main(String[] arges){
		welcome();
	}
	//进入超市菜单
	public static void welcome(){
		System.out.println("--------------------------");
		System.out.println("---欢迎进入超市管理系统---");
		System.out.println("----------1:进货----------");
		System.out.println("----------2:存货----------");
		System.out.println("----------3:售货----------");
		System.out.println("----------4:退出----------");
		System.out.println("--------------------------");
		int a=sc.nextInt();
		switch(a){
			case 1:
				addhuo();
				break;
			case 2:
				selecthuo();
				break;
			case 3:
				delecthuo();
				break;
			case 4:
				System.exit(0);
		}
	}
	//开始超市进货
	public static void addhuo(){
		boolean c=true;
		while(c){
		System.out.println("请输入商品名称");
		String name=sc.next();
		System.out.println("请输入商品类型");
		String xing=sc.next();
		System.out.println("请输入商品价格");
		int money=sc.nextInt();
		Chaoshi b=new Chaoshi(name,xing,money);
		n[i]=b;
		i++;
			System.out.println("添加商品成功,是否继续添加商品？");
			System.out.println("1:继续添加商品");
			System.out.println("2:返回菜单");
			int d=sc.nextInt();
			if(d==1){
				c=true;
			}else if(d==2){
				c=false;
			}else{
				System.out.println("输入有误,请重新输入");
			}
		}
		welcome();
	}
	//开始超市存货
	public static void selecthuo(){
		System.out.println("查询所有商品的信息请按1");
		System.out.println("查询单个商品的信息请按2");
		int e=sc.nextInt();
		if(e==1){
			for(int l=0;l<n.length;l++){
				if(n[l]!=null){
					n[l].say();
				}
			}
			welcome();
		}else if(e==2){
			System.out.println("请输入商品姓名");
			String f=sc.next();
			for(int g=0;g<n.length;g++){
				if((n[g]!=null)&&(f.equals(n[g].name))){
					n[g].say();
				}	
			}
			System.out.println("查询商品成功,是否继续查询？");
			System.out.println("如果继续查询,请按1");
			System.out.println("如果返回菜单,请按2");
			int h=sc.nextInt();
			if(h==1){
				selecthuo();
			}else if(h==2){
				welcome();
			}
		}
	}
	//开始超市销售
	public static void delecthuo(){
		System.out.println("删除所有商品信息请按1");
		System.out.println("删除单个商品信息请按2");
		int k=sc.nextInt();
		if(k==1){
			for(int m=0;m<n.length;m++){
				if(n[m]!=null){
					n[m]=null;
				}
			}
		}else if(k==2){
			System.out.println("请输入商品的名称");
			String o=sc.next();
			for(int p=0;p<n.length;p++){
				if((n[p]!=null)&&(o.equals(n[p].name))){
					n[p]=null;
				}
			}
			System.out.println("删除完成,是否继续删除？");
			System.out.println("继续删除,请按1");
			System.out.println("返回菜单,请按2");
			int q=sc.nextInt();
			if(q==1){
				delecthuo();
			}else if(q==2){
				welcome();
			}
		}
	}
}