// 이너클래스 (클래스 안의 클래스)
class C {
	int cN = 100;
	D out = new D();
}
class D{
	int dN = 200;
	void println(String Temp) {
		System.out.println("["+ Temp +"]");
	}
}
class System1{
	static E out = new E();
}
class E{
	static void println(String Temp) {
		System.out.println("{"+ Temp +"}");
	}
}
public class p0324_04 {
	public static void main(String[] args) {
		/*
		C objC = new C();
		System.out.println(objC.cN);
		System.out.println(objC.out.dN);
		objC.out.println("안 녕");
		*/
		System1.out.println("방가");
		System.out.println("방가");
	}
}
