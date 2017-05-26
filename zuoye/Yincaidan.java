import java.util.*;
public class Yincaidan{
		static Scanner sc =new Scanner(System.in);
		static Yinhang[] n=new Yinhang[100];
		static int i=0;
	public static void main(String[] arges){
		welcome();
	}
	public static void welcome(){
		System.out.println("--------------------------------------");
		System.out.println("----------欢迎进入银行管理系统--------");
		System.out.println("----------------1:存款----------------");
		System.out.println("----------------2:查询有多少钱--------");
		System.out.println("----------------3:取款----------------");
		System.out.println("----------------4:退出----------------");
		System.out.println("--------------------------------------");
		int a=sc.nextInt();
		switch(a){
			case 1:
				addqian();
				break;
			case 2:
				selectqian();
				break;
			case 3:
				delectqian();
				break;
			case 4:
				System.exit(0);
		}
	}
	//开始银行存钱
	public static void addqian(){
		boolean c=true;
		while(c){
		System.out.println("请输入存款人姓名");
		String name=sc.next();
		System.out.println("请输入存款人密码");
		String mima=sc.next();
		if(mima.length()<6){
			System.out.println("请重新输入");
			break;
		}
		System.out.println("请输入存款人存取的金额");
		int money=sc.nextInt();
		Yinhang b=new Yinhang(name,mima,money);
		n[i]=b;
		i++;
			System.out.println("添加存款人信息成功,是否继续添加？");
			System.out.println("1:继续添加");
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
	//开始查询金额
	public static void selectqian(){
		System.out.println("查询所有用户的信息请按1");
		System.out.println("查询单个用户的信息请按2");
		int e=sc.nextInt();
		if(e==1){
			for(int l=0;l<n.length;l++){
				if(n[l]!=null){
					n[l].say();
				}
			}
			welcome();
		}else if(e==2){
			System.out.println("请输入用户姓名");
			String f=sc.next();
			for(int g=0;g<n.length;g++){
				if((n[g]!=null)&&(f.equals(n[g].name))){
					n[g].say();
				}	
			}
			System.out.println("查询用户成功,是否继续查询？");
			System.out.println("如果继续查询,请按1");
			System.out.println("如果返回菜单,请按2");
			int h=sc.nextInt();
			if(h==1){
				selectqian();
			}else if(h==2){
				welcome();
			}
		}
	}
		//开始取钱
	public static void delectqian(){
		System.out.println("请选择取钱用户");
		String ll=sc.next();
		for(int rr=0;i<n.length;rr++){
			if((n[rr]!=null)&&(ll.equals(n[rr].name))){
					System.out.println("取走所有钱请按1");
					System.out.println("取走部分钱请按2");
					int k=sc.nextInt();
					if(k==1){
						n[rr].money=0;
					}else if(k==2){
						System.out.println("请输入要取走的钱数:");
						int hh=sc.nextInt();
						n[rr].money=n[rr].money-hh;
					}
					break;
				}else{
					System.out.println("查无此人");
					welcome();
				}
		}
		System.out.println("取钱完成,是否继续取钱？");
			System.out.println("继续取钱,请按1");
			System.out.println("返回菜单,请按2");
			int q=sc.nextInt();
			if(q==1){
				delectqian();
			}else if(q==2){
				welcome();
			}
	}
}