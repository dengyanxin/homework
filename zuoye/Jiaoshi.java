public class Jiaoshi{
	String name;//��ʦ����
	int age;//����
	char sex;//�Ա�
	String xi;//����ϵ
	String ke;//���̿�Ŀ
	public Jiaoshi(String name,int age,char sex,String xi,String ke){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.xi=xi;
		this.ke=ke;
	}
	public void say(){
		System.out.println("��ʦ����:"+name+" ����:"+age+" �Ա�:"+sex+" ����ϵ:"+xi+" ���̿�Ŀ:"+ke);
	}
}