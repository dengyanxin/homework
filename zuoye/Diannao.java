public class Diannao{
	String pin;//����Ʒ��
	String xing;//��������
	int cun;//���Գߴ�
	char pan;//���޹�̬Ӳ��
	public Diannao(String pin,String xing,int cun,char pan){
		this.pin=pin;
		this.xing=xing;
		this.cun=cun;
		this.pan=pan;
	}
	public void say(){
		System.out.println("����Ʒ��:"+pin+" ��������:"+xing+" ���Գߴ�"+cun+"��"+" ���޹�̬Ӳ��:"+pan);
	}
}