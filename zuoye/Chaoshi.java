public class Chaoshi{
	String name;//��Ʒ����
	String xing;//��Ʒ����
	int money;//��Ʒ�۸�
	public Chaoshi(String name,String xing,int money){
		this.name=name;
		this.xing=xing;
		this.money=money;
	}
	public void say(){
		System.out.println("��Ʒ����Ϊ:"+name+"    ��Ʒ����Ϊ:"+xing+"    ��Ʒ�۸�Ϊ"+money);
	}
}