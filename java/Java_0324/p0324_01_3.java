// static 2 : 
class Spring02{
	int iNum1 = 100;
	static int iNum2 = 200;
	void Hello1 () {
		System.out.println("==========");
		System.out.println("안녕1");
		System.out.println("iNum1 = " + iNum1); // 인스턴스 변수에 접근
		System.out.println("iNum1 = " + iNum2); // static 변수에 접근
		System.out.println("==========");
	}
	static void Hello2 () {
		System.out.println("==========");
		System.out.println("안녕2");
		//System.out.println("iNum1 = " + iNum1); // error. 인스턴스 변수에 접근 불가
		System.out.println("iNum1 = " + iNum2); // static 변수에 접근
		System.out.println("==========");
	}
}
public class p0324_01_3 {
	public static void main(String[] args) {
		// CASE1 : static(클래스) 메서드와 유사한 방법으로 사용할 수 있다.
		System.out.println("<<CASE1>>");
		Spring02 A = new Spring02();
		A.Hello1();
		A.Hello2();
		
		// CASE2 : 객체(인스턴스) 없이도 사용할 수 있다.
		System.out.println("<<CASE2>>");
		Spring02.Hello2();
		
		// CASE3 : static 변수에만 접근할 수 있다.
		System.out.println("<<CASE3>>");
		Spring02 B = new Spring02();
		B.Hello1();
		B.Hello2();
		
		// CASE4 : 클래스 내부의 메서드 호출 : static 메서드에만 접근할 수 있다.
	}
}
