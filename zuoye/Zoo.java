public class Zoo{
	public void givefoodfordog(Dog dog){
		System.out.println("��һ��");
		//����ת��
		if(dog instanceof Erha){
			((Erha)dog).biaoqing();
		}
		dog.eat();
	}
}