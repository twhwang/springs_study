// ��� (*extends)
class AAA {
	int iNum1 = 100;
	void Void1() {
		System.out.println("���� AAA�Ҽ��̴�.");
	}
}
class BBB extends AAA {
	int iNum2 = 200; // AAA�� ���� ��ӹ��� (iNum1, iNum2 �� �� ����)
	void Void2() {
		System.out.println("���� BBB�Ҽ��̴�.");
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
