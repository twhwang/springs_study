// 접근 제어자를 다른 클래스에서 사용하기 위해서는?
class Car{
	private int iSpeed;
	
	int SpeedState() {
		return iSpeed; // 직접적인 사용은 할 수 없지만 다른 메서드로 반환받아 사용은 가능하다.
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
