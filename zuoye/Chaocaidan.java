//���в˵�
import java.util.*;
public class Chaocaidan{
	static Scanner sc =new Scanner(System.in);
	static Chaoshi[] n=new Chaoshi[100];
	static int i=0;
	public static void main(String[] arges){
		welcome();
	}
	//���볬�в˵�
	public static void welcome(){
		System.out.println("--------------------------");
		System.out.println("---��ӭ���볬�й���ϵͳ---");
		System.out.println("----------1:����----------");
		System.out.println("----------2:���----------");
		System.out.println("----------3:�ۻ�----------");
		System.out.println("----------4:�˳�----------");
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
	//��ʼ���н���
	public static void addhuo(){
		boolean c=true;
		while(c){
		System.out.println("��������Ʒ����");
		String name=sc.next();
		System.out.println("��������Ʒ����");
		String xing=sc.next();
		System.out.println("��������Ʒ�۸�");
		int money=sc.nextInt();
		Chaoshi b=new Chaoshi(name,xing,money);
		n[i]=b;
		i++;
			System.out.println("�����Ʒ�ɹ�,�Ƿ���������Ʒ��");
			System.out.println("1:���������Ʒ");
			System.out.println("2:���ز˵�");
			int d=sc.nextInt();
			if(d==1){
				c=true;
			}else if(d==2){
				c=false;
			}else{
				System.out.println("��������,����������");
			}
		}
		welcome();
	}
	//��ʼ���д��
	public static void selecthuo(){
		System.out.println("��ѯ������Ʒ����Ϣ�밴1");
		System.out.println("��ѯ������Ʒ����Ϣ�밴2");
		int e=sc.nextInt();
		if(e==1){
			for(int l=0;l<n.length;l++){
				if(n[l]!=null){
					n[l].say();
				}
			}
			welcome();
		}else if(e==2){
			System.out.println("��������Ʒ����");
			String f=sc.next();
			for(int g=0;g<n.length;g++){
				if((n[g]!=null)&&(f.equals(n[g].name))){
					n[g].say();
				}	
			}
			System.out.println("��ѯ��Ʒ�ɹ�,�Ƿ������ѯ��");
			System.out.println("���������ѯ,�밴1");
			System.out.println("������ز˵�,�밴2");
			int h=sc.nextInt();
			if(h==1){
				selecthuo();
			}else if(h==2){
				welcome();
			}
		}
	}
	//��ʼ��������
	public static void delecthuo(){
		System.out.println("ɾ��������Ʒ��Ϣ�밴1");
		System.out.println("ɾ��������Ʒ��Ϣ�밴2");
		int k=sc.nextInt();
		if(k==1){
			for(int m=0;m<n.length;m++){
				if(n[m]!=null){
					n[m]=null;
				}
			}
		}else if(k==2){
			System.out.println("��������Ʒ������");
			String o=sc.next();
			for(int p=0;p<n.length;p++){
				if((n[p]!=null)&&(o.equals(n[p].name))){
					n[p]=null;
				}
			}
			System.out.println("ɾ�����,�Ƿ����ɾ����");
			System.out.println("����ɾ��,�밴1");
			System.out.println("���ز˵�,�밴2");
			int q=sc.nextInt();
			if(q==1){
				delecthuo();
			}else if(q==2){
				welcome();
			}
		}
	}
}