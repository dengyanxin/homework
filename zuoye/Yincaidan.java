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
		System.out.println("----------��ӭ�������й���ϵͳ--------");
		System.out.println("----------------1:���----------------");
		System.out.println("----------------2:��ѯ�ж���Ǯ--------");
		System.out.println("----------------3:ȡ��----------------");
		System.out.println("----------------4:�˳�----------------");
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
	//��ʼ���д�Ǯ
	public static void addqian(){
		boolean c=true;
		while(c){
		System.out.println("��������������");
		String name=sc.next();
		System.out.println("��������������");
		String mima=sc.next();
		if(mima.length()<6){
			System.out.println("����������");
			break;
		}
		System.out.println("���������˴�ȡ�Ľ��");
		int money=sc.nextInt();
		Yinhang b=new Yinhang(name,mima,money);
		n[i]=b;
		i++;
			System.out.println("��Ӵ������Ϣ�ɹ�,�Ƿ������ӣ�");
			System.out.println("1:�������");
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
	//��ʼ��ѯ���
	public static void selectqian(){
		System.out.println("��ѯ�����û�����Ϣ�밴1");
		System.out.println("��ѯ�����û�����Ϣ�밴2");
		int e=sc.nextInt();
		if(e==1){
			for(int l=0;l<n.length;l++){
				if(n[l]!=null){
					n[l].say();
				}
			}
			welcome();
		}else if(e==2){
			System.out.println("�������û�����");
			String f=sc.next();
			for(int g=0;g<n.length;g++){
				if((n[g]!=null)&&(f.equals(n[g].name))){
					n[g].say();
				}	
			}
			System.out.println("��ѯ�û��ɹ�,�Ƿ������ѯ��");
			System.out.println("���������ѯ,�밴1");
			System.out.println("������ز˵�,�밴2");
			int h=sc.nextInt();
			if(h==1){
				selectqian();
			}else if(h==2){
				welcome();
			}
		}
	}
		//��ʼȡǮ
	public static void delectqian(){
		System.out.println("��ѡ��ȡǮ�û�");
		String ll=sc.next();
		for(int rr=0;i<n.length;rr++){
			if((n[rr]!=null)&&(ll.equals(n[rr].name))){
					System.out.println("ȡ������Ǯ�밴1");
					System.out.println("ȡ�߲���Ǯ�밴2");
					int k=sc.nextInt();
					if(k==1){
						n[rr].money=0;
					}else if(k==2){
						System.out.println("������Ҫȡ�ߵ�Ǯ��:");
						int hh=sc.nextInt();
						n[rr].money=n[rr].money-hh;
					}
					break;
				}else{
					System.out.println("���޴���");
					welcome();
				}
		}
		System.out.println("ȡǮ���,�Ƿ����ȡǮ��");
			System.out.println("����ȡǮ,�밴1");
			System.out.println("���ز˵�,�밴2");
			int q=sc.nextInt();
			if(q==1){
				delectqian();
			}else if(q==2){
				welcome();
			}
	}
}