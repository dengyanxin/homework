//ѧ���˵�
import java.util.*;
public class Caidan{
		static Scanner sc=new Scanner(System.in);
		static Student[] n=new Student[100];
		static int i=0;
	public static void main(String[] arges){
		printMenu();
	}
	public static void printMenu(){
		System.out.println("==��ӭ����ѧ����Ϣ����ϵͳ==");
		System.out.println("===========1:����===========");
		System.out.println("===========2:�޸�===========");
		System.out.println("===========3:��ѯ===========");
		System.out.println("===========4:ɾ��===========");
		System.out.println("===========5:�˳�===========");
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
	public static void addstudent(){//����ѧ����Ϣ
			boolean k=true;
			while (k==true){
			System.out.println("������ѧ������:");
			String name=sc.next();
			System.out.println("������ѧ������:");
			int age=sc.nextInt();
			System.out.println("������ѧ���Ա�:");
			char sex=sc.next().charAt(0);
			Student b=new Student(name,age,sex);
			n[i]=b;
			i++;
			System.out.println("¼��ɹ�,�Ƿ����¼�룿");
			System.out.println("1:����¼��");
			System.out.println("2:���ز˵�");
			int m=sc.nextInt();
			if(m==1){
				k=true;
			}else if(m==2){
				k=false;
			}else{
				System.out.println("��������");
			}	
		}
		printMenu();
	}
//-----------------------------------------------------------------------------------------------
	public static void updatestudent(){//�޸�ѧ����Ϣ
		System.out.println("������Ҫ�޸���Ϣ��ѧ��");
		for(int l=0;l<n.length;l++){
				if(n[l]!=null){
					n[l].say();
				}
			}
			String mm=sc.next();
			for(int p=0;p<n.length;p++){
				if((n[p]!=null)&&(mm.equals(n[p].name))){
					System.out.println("1:�޸�ѧ������");
					System.out.println("2:�޸�ѧ���Ա�");
					System.out.println("3:�޸�ѧ������");
					System.out.println("4:�޸�ȫ��");
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
							System.out.println("������ѧ������:");
							String wwww=sc.next();
							n[p].name=wwww;
							System.out.println("������ѧ������:");
							char eeee=sc.nextChar();
							n[p].sex=eeee;
							System.out.println("������ѧ���Ա�:");
							int qqqq=sc.nextInt();
							n[p].age=qqqq;
					}
				}
			}
	}
//-----------------------------------------------------------------------------------------
	public static void selectstudent(){//��ѯѧ����Ϣ
		System.out.println("��ѯ����ѧ����Ϣ,������1");
		System.out.println("��ѯ����ѧ����Ϣ,������2");
		int z=sc.nextInt();
		if(z==1){
			for(int l=0;l<n.length;l++){
				if(n[l]!=null){
					n[l].say();
				}
			}
			printMenu();
		}else if (z==2){
			System.out.println("������ѧ������");
			String mm=sc.next();
			for(int p=0;p<n.length;p++){
				if((n[p]!=null)&&(mm.equals(n[p].name))){
					n[p].say();
				}
			}
			System.out.println("��ѯ�ɹ�,�Ƿ������ѯ��");
			System.out.println("1:������ѯ");
			System.out.println("2:���ز˵�");
			int v=sc.nextInt();
			if(v==1){
				selectstudent();
			}else if(v==2){
				printMenu();
			}
		}
	}
//----------------------------------------------------------------------------------------------------
	public static void deletestudent(){//ɾ��ѧ����Ϣ
		System.out.println("ɾ������ѧ����Ϣ,������1");
		System.out.println("ɾ������ѧ����Ϣ,������2");
		int q=sc.nextInt();
		if(q==1){
			for(int w=0;w<n.length;w++){
				if(n[w]!=null){
					n[w]=null;
				}
			}
			printMenu();
		}else if (q==2){
			System.out.println("������ѧ������");
			String qq=sc.next();
			for(int e=0;e<n.length;e++){
				if((n[e]!=null)&&(qq.equals(n[e].name))){
					n[e]=null;
				}
			}
			System.out.println("ɾ���ɹ�,�Ƿ����ɾ����");
			System.out.println("1:����ɾ��");
			System.out.println("2:���ز˵�");
			int r=sc.nextInt();
			if(r==1){
				selectstudent();
			}else if(r==2){
				printMenu();
			}
		}
	}
}