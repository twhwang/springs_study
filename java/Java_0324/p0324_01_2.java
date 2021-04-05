// static 1 : static을 변수 앞에 붙이는 경우 - 스태틱 변수
class Spring01 {
	int iNum1 = 100; // 인스턴스 변수 : 객체(인스턴스)가 생성되어야 사용할 수 있다.
	static int iNum2 = 200; // 스태틱(클래스) 변수 : 객체가 없어도 사용할 수 있다. / 프로그램 생성 전에 이미 생성
}
public class p0324_01_2 {
	public static void main(String[] args) {
		// CASE1 : 인스턴스 변수와 유사한 방법으로 사용할 수 있다.
		System.out.println("<<CASE1>>");
		Spring01 aSpr01 = new Spring01();
		System.out.println(aSpr01.iNum1);
		System.out.println(aSpr01.iNum2);
		
		// CASE2 : 객체(인스턴스) 없이도 사용할 수 있다.
		System.out.println("<<CASE2>>");
		System.out.println(Spring01.iNum2);
		
		// CASE3 : 공용으로 사용되는 클래스 변수
		System.out.println("<<CASE3>>");
		Spring01 aS01 = new Spring01();
		Spring01 aS02 = new Spring01();
		System.out.println(aS01.iNum1);
		System.out.println(aS01.iNum2);
		System.out.println(aS02.iNum1);
		System.out.println(aS02.iNum2);
		++aS01.iNum1;
		++aS01.iNum2;
		++aS02.iNum1;
		++aS02.iNum2;
		System.out.println(aS01.iNum1);
		System.out.println(aS01.iNum2);
		System.out.println(aS02.iNum1);
		System.out.println(aS02.iNum2);
	}
}
