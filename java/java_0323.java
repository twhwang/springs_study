// 객체의 정리
class Car{
	String color;
	String brand;
	int speed ;
	boolean ignition = !true;
	void speedState() {
		System.out.println("현재 이 자동차의 주행 속도는 \"" + speed + "km/h\" 입니다.");
	}
	void speedUp() {
		speed+=10;
		speedState();
	}
	void speedDown() {
		speed-=10;
		speedState();
	}
	void turnOn() {
		ignition = true;
		System.out.println("운행을 시작합니다.");
	}
	void turnOff() {
		ignition = !true;
		System.out.println("운행을 종료합니다.");
	}
}

public class p0323_01 {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "검정";
		myCar.brand = "벤츠";
		System.out.println("이 자동차의 색상은 " + myCar.color + "색 입니다.");
		System.out.println("이 자동차의 브랜드는 " + myCar.brand + "입니다.");
		myCar.turnOn();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.turnOff();
	}
}

// 콜백
public class p0323_02 {
	public static void main(String[] args) {
		int Num1 = 100;
		int Num2 = 200;
		
		FirstInt(Num1);
		System.out.println("Main : Num1 = " + Num1);
		System.out.println("Main : Num2 = " + Num2);
		
	}
	public static void FirstInt(int Num1) {
		int Num2 = 300;
		
		SecondInt(Num1);
		System.out.println("FirstInt : Num1 = " + Num1);
		System.out.println("FirstInt : Num2 = " + Num2);
		
		return;
	}
	public static void SecondInt(int Num1) {
		int Num2 = 400;
		
		System.out.println("SecondInt : Num1 = " + Num1);
		System.out.println("SecondInt : Num2 = " + Num2);
		
		return;
	}
}

// 기본형 매개변수
class Data{
	int x;
}
public class p0323_02_2 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() :  x = " + d.x);
		
		change(d.x);
		System.out.println("main() :  x = " + d.x);
		
	}
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}

// 생성자
class Car2 {
	String color;
	String brand;
	int speed;
	boolean ignition = !true;
	
	void State() {
		System.out.println("==========");
		System.out.println(color);
		System.out.println(brand);
	}
	
	void speedState() {
		System.out.println("현재 이 자동차의 주행 속도는 \"" + speed + "km/h\" 입니다.");
	}
	void speedUp() {
		speed+=10;
		speedState();
	}
	void speedDown() {
		speed-=10;
		speedState();
	}
	void turnOn() {
		ignition = true;
		System.out.println("운행을 시작합니다.");
	}
	void turnOff() {
		ignition = !true;
		System.out.println("운행을 종료합니다.");
	}
	
	Car2(String inputColor, String inputBrand){
		// Car2 클래스의 생성자
		color = inputColor;
		brand = inputBrand;
	}
}
public class p0323_03 {
	public static void main(String[] args) {
		/*
		 생성자 : 객체를 생성할 때 JVM에 의해 자동으로 호출되는 특수한 메서드
		 특징1 : 클래스 이름과 동일한 이름을 가진다.
		 특징2 : 객체당 1번만 호출된다.
		 특징3 : 반환형(return type)을 기재하는 곳에 아무 것도 적지 않는다.
		 즉, 반환할 수 없다.
		*/
		
		Car2 myCar1 = new Car2("red","Model003");
		Car2 myCar2 = new Car2("yellow","Model007");
		Car2 myCar3 = new Car2("Blue","Model018");

		myCar1.State();
		myCar2.State();
		myCar3.State();

	}
}

// 연습문제 207p
public class p0323_03_2 {
	public static void main(String[] args) {
		Student std = new Student("홍길동", 1, 1, 100, 60, 76);
		std.Info();
		System.out.println("총점 : " + std.getTotal());
		System.out.println("평균 : " + std.getAverage());
	}
}
class Student{
	String name;
	int ban;
	int num;
	int kor;
	int eng;
	int math;
	
	Student (String inputName, int inputBan, int inputNum, int inputKor, int inputEng, int inputMath){
		name = inputName;
		ban = inputBan;
		num = inputNum;
		kor = inputKor;
		eng = inputEng;
		math = inputMath;
	}
	
	void Info() {
		System.out.println("이름 : " + name);
		System.out.println("반 : " + ban + "반");
		System.out.println("번호 : " + num + "번");
		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + math + "점");
	}
	
	int getTotal(){
		return kor+eng+math;
	}
	
	float getAverage(){
		return Math.round((getTotal()/3.0f)*10f)/10.0f;
	}
	
}

// 메서드 오버로딩
public class p0323_04 {
	public static void main(String[] args) {
		System.out.println(add(100, 55));
		System.out.println(add(3.5, 5.5));
		System.out.println(add("하나가 ","되다"));
	}
	public static int add(int Val1, int Val2) {
		return Val1 + Val2;
	}
	public static double add(double Val1, double Val2) {
		return Val1 + Val2;
	}
	public static String add(String Val1, String Val2) {
		return Val1 + Val2;
	}
}

// 디폴트 생성자 관련
// 1. 디폴트 생성자는 프로그래머가 작업하지 않으면 컴파일러가 만들어 줌
// 2. 다른 생성자가 1개라도 존재할 경우 컴파일러는 디폴트 생성자를 만들지 않음
public class p0323_05 {
	public static void main(String[] args) {
		
		Spring spring = new Spring();
		
	}
}
class Spring {
	Spring(){
		
	}
	Spring(int iNum){
		System.out.println("생성자 구동 : " + iNum);
	}
}

// this.의 사용
class SpringMember{
	String name;
	String mobile;
	String major;
	
	// 인스턴스 변수와 지역 변수는 동일한 이름을 사용할 수 없다.
	SpringMember(String name, String mobile, String major){
		this.name = name;
		this.mobile = mobile;
		this.major = major;
	} // this(현재 코드를 실행하는 객체를 나타냄)
	
	void State(){
		System.out.println("이름 : " + name);
		System.out.println("전번 : " + mobile);
		System.out.println("특기 : " + major); // 원래는 this.인스턴스 변수명을 적어야 하지만
		                                       // 통상적으로 그냥 생략함
	}
	
}
public class p0323_06 {
	public static void main(String[] args) {
		SpringMember obj = new SpringMember("홍길동", "010-1234-5678", "자바 프로그래밍");
		obj.State();
	}
}

// this()의 사용법
class SpringMemberA{
	String name;
	String mobile;
	String major;

	SpringMemberA(String name, String mobile, String major){
		this.name = name;
		this.mobile = mobile;
		this.major = major;
	}
	
	SpringMemberA(String name, String mobile){
		this(name, mobile, "자바"); //생성자를 호출
		// 1. 무조건 생성자 첫 줄에만 사용할 수 있다.
		//this.name = name;
		//this.mobile = mobile;
		//this.major = "자바";
	}
	
	void State(){
		System.out.println("이름 : " + name);
		System.out.println("전번 : " + mobile);
		System.out.println("특기 : " + major);
	}
}
public class p0323_07 {
	public static void main(String[] args) {
		SpringMemberA obj = new SpringMemberA("홍길동", "010-1234-5678");
		obj.State();
	}
}
