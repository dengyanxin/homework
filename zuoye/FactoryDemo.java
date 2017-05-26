public class FactoryDemo {
	public static void main(String[] args) {
		ICellPhone p = Factory.aaa("htc");
		p.sendMsg();
	}
}

//�ֻ���׼
interface ICellPhone {
	void sendMsg();
}

// HTC�ֻ� 
class HTC implements ICellPhone {
	public void sendMsg() {
		System.out.println("����htc�ֻ�");
	}
}

// IPhone�ֻ� 
class IPhone implements ICellPhone {
	public void sendMsg() {
		System.out.println("����iphone�ֻ�");
	}
}
// ��Ϊ�ֻ� 
class Huawei implements ICellPhone{
	public void sendMsg(){
		System.out.println("���ǻ�Ϊ�ֻ�");
	}
}

// �ֻ����� 
class Factory {
	public static ICellPhone aaa(String type){
		ICellPhone phone = null;
		if("htc".equals(type)){
			phone = new HTC();
		}else if("iphone".equals(type)){
			phone = new IPhone();
		}else if("��Ϊ".equals(type)){
			phone = new Huawei();
		}
		return phone;
	}
}






























