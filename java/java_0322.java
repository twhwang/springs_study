// 메서드 복습
public class p0322_01 {
	public static void main(String[] args) { // Entry Point(진입점)이 없으면 실행이 안됨 -_-
		System.out.println("main 메서드를 실행");
		NoReturn();
		ReturnInteger(); // 반환 값을 수행하지 않는 경우
		int ReturnNum = ReturnInteger(); // 반환 값을 사용할 경우 변수를 선언하고 해당 메서드를 호출
		System.out.println(ReturnNum);;
		ReturnNum = ReturnInteger2();
		System.out.println(ReturnNum);
		ReturnArg(99);
		ReturnArg(1400);
		ReturnArg2(1000, 1004);

	}
	public static void NoReturn() {
		System.out.println("NoReturn : 반환하지 않음");
	}
	public static int ReturnInteger() {
		System.out.println("ReturnInteger : 정수형으로 반환");
		return 100;
	}
	public static int ReturnInteger2() {
		int Temp = 1000;
		System.out.println("Temp 값을 출력");
		return Temp;
	}
	public static void ReturnArg(int ArgNum) { // 인자를 테스트한다.
		System.out.println("ReturnArg : 인자를 호출한다 " + ArgNum);
	}
	public static void ReturnArg2(int ArgNum1, int ArgNum2) { // 인자를 테스트한다.
		System.out.println("2개 이상의 인자를 호출한다. (" + ArgNum1 + "," + ArgNum2 + ")");
	}
}

// 메서드 사칙연산
public class p0322_02 {
	public static int addMethod (int iNum1, int iNum2) {
	int iNum3 = iNum1 + iNum2;
	return iNum3;
	}
	public static int minusMethod (int iNum1, int iNum2) {
	int iNum3 = iNum1 - iNum2;
	return iNum3;
	}
	public static int multiMethod (int iNum1, int iNum2) {
	int iNum3 = iNum1 * iNum2;
	return iNum3;
	}
	public static int divideMethod (int iNum1, int iNum2) {
	int iNum3 = iNum1 / iNum2;
	return iNum3;
	}
	public static int remainMethod (int iNum1, int iNum2) {
	int iNum3 = iNum1 % iNum2;
	return iNum3;
	}
	public static void main(String[] args) {
		int iTemp = addMethod(10, 5);
		System.out.println(iTemp);
		iTemp = minusMethod(10, 5);
		System.out.println(iTemp);
		iTemp = multiMethod(10, 5);
		System.out.println(iTemp);
		iTemp = divideMethod(10, 5);
		System.out.println(iTemp);
		iTemp = remainMethod(10, 5);
		System.out.println(iTemp);
	}
}

// 메서드 - 지역 변수 : 메서드 내부에서 만들어진 변수
public class p0322_03 {
	public static void Spring (int iNum) {
		System.out.println(iNum);
		iNum = 33;
		System.out.println(iNum);
	}
	public static void Summer (int iNum) {
		System.out.println(iNum);
	}
	public static void main(String[] args) {
		int iNum = -50;
		System.out.println(iNum);
		Spring(iNum);
		Summer(iNum);
	}
}


public class p0322_04 {
	public static void main(String[] args) {
		human_stat john = new human_stat(); // 객체참조변수(4byte)를 활용한 객체 생성 '객체 객체변수 = new 객체'
		john.eat();
		john.sleep();
		john.walk();
		john.age = 20;
		john.height = 181;
		System.out.println("john의 나이는 " + john.age + "이며 john의 키는 " + john.height + "이다." );
	}
}

class human_stat{
	double height;
	int age;
	void eat() {
		System.out.println("먹다.");
	}
	void sleep() {
		System.out.println("잔다.");
	}
	void walk() {
		System.out.println("걷다.");
	}
}

// 클래스 : 모양을 정의하는 것
// 오브젝트 : 정의된 모양을 생성하는 것

// 객체 생성과 사용 예제
public class p0322_04_2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("현재 t1 채널은 " + t1.channel + "번 입니다.");
		System.out.println("현재 t2 채널은 " + t2.channel + "번 입니다.");
		t1.channel = 7;
		System.out.println("t1 채널을 " + t1.channel + "번으로 적용하였습니다.");
		t1.channelDown();
		System.out.println("t1 채널을 " + t1.channel + "번으로 변경하였습니다.");
		System.out.println("t2 채널은 " + t2.channel + "번 입니다.");
	}	
}

class Tv{
	// 클래스 Tv의 속성 (멤버변수)
	String color; // 인스턴스 변수
	boolean power;
	int channel;
	// 클래스 Tv의 기능 (메서드)
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}

// 객체 배열
public class p0322_05 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; //객체 배열을 생성
		tvArr[0] = new Tv(); // Tv 객체를 생성
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		tvArr[0].power();
		tvArr[1].power();
		tvArr[2].power();
		
	}
}

public class p0322_06 {
	public static void main(String[] args) {
		String aStr = "문자열을 표시";
		System.out.println(aStr);
		System.out.println(aStr.length());
		String bStr = null;
		System.out.println(bStr);
		System.out.println(bStr.length());
	}
}

class Spring{
	int iNum1 = 100; // 인스턴스(객체)의 변수
	int iNum2;
	int iNum3 = 100;
	String aStr; // Heap(객체 영역)은 변수의 초기화가 0, Null으로 설정되어 있다.
}
public class p0322_07 {
	public static void main(String[] args) {
		
		/*
		int iNum1 = 100; // 지역변수 초기화
		int iNum2; // 지역변수는 초기화없이 사용할 수 없다.
		int iNum3 = 100;
		*/

		Spring aSp = new Spring();
		
		System.out.printf("%d, %d, %d, %s",
				aSp.iNum1, aSp.iNum2, aSp.iNum3, aSp.aStr);
	}
}
