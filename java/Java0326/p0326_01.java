// ���������� ����ȯ - 249p ����
class Car{
	String color;
	int door;
	void drive (){
		System.out.println("drive, brrrr...");
	}
	void stop () {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{
	void water () {
		System.out.println("water!!!");
	}
}
public class p0326_01 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		fe1.water();
		car = fe1; // car = (Car)fe;���� ����ȯ�� ����
		// car.water(); *water�� �ڼ��� �޼����� �׷��� ������ ���������� ������ �Ұ���
		car.drive();
		
		fe2 = (FireEngine)car; // �ڼ�Ÿ�� <- ����Ÿ��. ������ �Ұ���
		fe2.water();
		
		Car aCar = new Car();
		FireEngine aFire = null;
		
		if(aCar instanceof FireEngine) {
			aFire = (FireEngine)aCar;
			System.out.println("����");
		} else {
			System.out.println("�Ȱ���");
		}
		
		
		
		
	}
}
