public class Yinhang{
	public String name;//���������
	private String mima;//���������
	public int money;//��ȡ�Ľ��
	public Yinhang(String name,String mima,int money){
		this.name=name;
		this.mima=mima;
		this.money=money;
	} 
	public void say(){
		System.out.println("���������:"+name+"    ���������:"+mima+"    ��ȡ�Ľ��:"+money);
	}
}