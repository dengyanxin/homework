//学生菜单
import java.util.*;
public class Caidan{
		static Scanner sc=new Scanner(System.in);
		static Student[] n=new Student[100];
		static int i=0;
	public static void main(String[] arges){
		printMenu();
	}
	public static void printMenu(){
		System.out.println("==欢迎进入学生信息管理系统==");
		System.out.println("===========1:增加===========");
		System.out.println("===========2:修改===========");
		System.out.println("===========3:查询===========");
		System.out.println("===========4:删除===========");
		System.out.println("===========5:退出===========");
		int flag=sc.nextInt();
		switch(flag){
		case 1:
			addstudent();
			break;
		case 2:
			updatestudent();
			break;
		case 3:
			selectstudent();
			break;
		case 4:
			deletestudent();
			break;
		case 5:
			System.exit(0);
		}
	}
//---------------------------------------------------------------------------------------------------
	public static void addstudent(){//增加学生信息
			boolean k=true;
			while (k==true){
			System.out.println("请输入学生姓名:");
			String name=sc.next();
			System.out.println("请输入学生年龄:");
			int age=sc.nextInt();
			System.out.println("请输入学生性别:");
			char sex=sc.next().charAt(0);
			Student b=new Student(name,age,sex);
			n[i]=b;
			i++;
			System.out.println("录入成功,是否继续录入？");
			System.out.println("1:继续录入");
			System.out.println("2:返回菜单");
			int m=sc.nextInt();
			if(m==1){
				k=true;
			}else if(m==2){
				k=false;
			}else{
				System.out.println("输入有误");
			}	
		}
		printMenu();
	}
//-----------------------------------------------------------------------------------------------
	public static void updatestudent(){//修改学生信息
		System.out.println("请输入要修改信息的学生");
		for(int l=0;l<n.length;l++){
				if(n[l]!=null){
					n[l].say();
				}
			}
			String mm=sc.next();
			for(int p=0;p<n.length;p++){
				if((n[p]!=null)&&(mm.equals(n[p].name))){
					System.out.println("1:修改学生姓名");
					System.out.println("2:修改学生性别");
					System.out.println("3:修改学生年龄");
					System.out.println("4:修改全部");
					int sa=sc.nextInt();
					switch(sa){
						case 1:
							String vvv=sc.next();
							n[p].name=vvv;
							break;
						case 2:
							char ccc=sc.nextChar();
							n[p].sex=ccc;
							break;
						case 3:
							int bbb=sc.nextInt();
							n[p].age=bbb;
							break;
						case 4:
							System.out.println("请输入学生姓名:");
							String wwww=sc.next();
							n[p].name=wwww;
							System.out.println("请输入学生年龄:");
							char eeee=sc.nextChar();
							n[p].sex=eeee;
							System.out.println("请输入学生性别:");
							int qqqq=sc.nextInt();
							n[p].age=qqqq;
					}
				}
			}
	}
//-----------------------------------------------------------------------------------------
	public static void selectstudent(){//查询学生信息
		System.out.println("查询所有学生信息,请输入1");
		System.out.println("查询单个学生信息,请输入2");
		int z=sc.nextInt();
		if(z==1){
			for(int l=0;l<n.length;l++){
				if(n[l]!=null){
					n[l].say();
				}
			}
			printMenu();
		}else if (z==2){
			System.out.println("请输入学生姓名");
			String mm=sc.next();
			for(int p=0;p<n.length;p++){
				if((n[p]!=null)&&(mm.equals(n[p].name))){
					n[p].say();
				}
			}
			System.out.println("查询成功,是否继续查询？");
			System.out.println("1:继续查询");
			System.out.println("2:返回菜单");
			int v=sc.nextInt();
			if(v==1){
				selectstudent();
			}else if(v==2){
				printMenu();
			}
		}
	}
//----------------------------------------------------------------------------------------------------
	public static void deletestudent(){//删除学生信息
		System.out.println("删除所有学生信息,请输入1");
		System.out.println("删除单个学生信息,请输入2");
		int q=sc.nextInt();
		if(q==1){
			for(int w=0;w<n.length;w++){
				if(n[w]!=null){
					n[w]=null;
				}
			}
			printMenu();
		}else if (q==2){
			System.out.println("请输入学生姓名");
			String qq=sc.next();
			for(int e=0;e<n.length;e++){
				if((n[e]!=null)&&(qq.equals(n[e].name))){
					n[e]=null;
				}
			}
			System.out.println("删除成功,是否继续删除？");
			System.out.println("1:继续删除");
			System.out.println("2:返回菜单");
			int r=sc.nextInt();
			if(r==1){
				selectstudent();
			}else if(r==2){
				printMenu();
			}
		}
	}
}