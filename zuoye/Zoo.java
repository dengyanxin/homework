public class Zoo{
	public void givefoodfordog(Dog dog){
		System.out.println("玩一会");
		//类型转换
		if(dog instanceof Erha){
			((Erha)dog).biaoqing();
		}
		dog.eat();
	}
}