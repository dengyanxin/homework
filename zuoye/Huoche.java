//����
public class Huoche{
	String name;//����
	String leixing;//������
	String cheng;//��������
	String jian;//����ʱ��
	String chengshi;//�������
	String shi;//��վʱ��
	public Huoche(String name,String leixing,String cheng,String jian,String chengshi,String shi){
		this.name=name;
		this.leixing=leixing;
		this.cheng=cheng;
		this.jian=jian;
		this.chengshi=chengshi;
		this.shi=shi;
	}
	public void say(){
		System.out.print("������:"+name+" ��������:"+leixing+" ����������:"+cheng+" ����ʱ����:"+jian+" ���������:"+chengshi+" ����ʱ����:"+shi+"\n");
	}
}