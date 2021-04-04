interface myIf1{
	default void method1() {
		System.out.println("method1() in myIf1");
	}
	default void method2() {
		System.out.println("method2() in myIf1");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in myIf1");
	}
}
interface myIf2{
	default void method1() {
		System.out.println("method1() in myIf2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in myIf2");
	}
}
class paR{
	public void method2() {
		System.out.println("method2() in paR");
	}
}

class chL extends paR implements myIf1, myIf2 {
	public void method1() {
		System.out.println("method1() in chL");
	}
}

public class p0326_06 {
	public static void main(String[] args) {
		chL c = new chL();
		c.method1();
		c.method2();
		myIf1.staticMethod();
		myIf2.staticMethod();
	}
}
