// 참조변수의 형변환 - 249p 예제
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
		car = fe1; // car = (Car)fe;에서 형변환이 생략
		// car.water(); *water는 자손의 메서드임 그래서 조상의 참조변수는 접근이 불가능
		car.drive();
		
		fe2 = (FireEngine)car; // 자손타입 <- 조상타입. 생략이 불가능
		fe2.water();
		
		Car aCar = new Car();
		FireEngine aFire = null;
		
		if(aCar instanceof FireEngine) {
			aFire = (FireEngine)aCar;
			System.out.println("가짐");
		} else {
			System.out.println("안가짐");
		}
		
		
		
		
	}
}
