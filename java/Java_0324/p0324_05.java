// 상속 (*extends)
class AAA {
	int iNum1 = 100;
	void Void1() {
		System.out.println("나는 AAA소속이다.");
	}
}
class BBB extends AAA {
	int iNum2 = 200; // AAA의 값도 상속받음 (iNum1, iNum2 둘 다 소유)
	void Void2() {
		System.out.println("나는 BBB소속이다.");
	}
}
public class p0324_05 {
	public static void main(String[] args) {
		BBB obj = new BBB();
		System.out.println(obj.iNum1);
		System.out.println(obj.iNum2);
		obj.Void1();
		obj.Void2();
	}
}
