// ���� �����ڸ� �ٸ� Ŭ�������� ����ϱ� ���ؼ���?
class Car{
	private int iSpeed;
	
	int SpeedState() {
		return iSpeed; // �������� ����� �� �� ������ �ٸ� �޼���� ��ȯ�޾� ����� �����ϴ�.
	}
	
	void Accel() {
		iSpeed = iSpeed +10;
		if(iSpeed > 100) {
			iSpeed = 100;
		}
	}
}
public class p0325_06 {

	public static void main(String[] args) {
		Car aCar = new Car();
		for(int i = 0 ; i <= 20 ; i++) {
		aCar.Accel();
		System.out.println(aCar.SpeedState());
		}
	}
}
