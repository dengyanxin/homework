public class Rongyao{
	String name;//Ӣ������
	String xing;//Ӣ������
	int xue;//Ӣ��Ѫ��
	String neng;//Ӣ�ۼ���
	public Rongyao(String name,String xing,int xue,String neng){
		this.name=name;
		this.xing=xing;
		this.xue=xue;
		this.neng=neng;
	}
	public void say(){
		System.out.println("Ӣ������:"+name+"  Ӣ������:"+xing+"  Ӣ��Ѫ��:"+xue+"  Ӣ�ۼ���:"+neng);
	}
}