// static 2 : 
class Spring02{
	int iNum1 = 100;
	static int iNum2 = 200;
	void Hello1 () {
		System.out.println("==========");
		System.out.println("�ȳ�1");
		System.out.println("iNum1 = " + iNum1); // �ν��Ͻ� ������ ����
		System.out.println("iNum1 = " + iNum2); // static ������ ����
		System.out.println("==========");
	}
	static void Hello2 () {
		System.out.println("==========");
		System.out.println("�ȳ�2");
		//System.out.println("iNum1 = " + iNum1); // error. �ν��Ͻ� ������ ���� �Ұ�
		System.out.println("iNum1 = " + iNum2); // static ������ ����
		System.out.println("==========");
	}
}
public class p0324_01_3 {
	public static void main(String[] args) {
		// CASE1 : static(Ŭ����) �޼���� ������ ������� ����� �� �ִ�.
		System.out.println("<<CASE1>>");
		Spring02 A = new Spring02();
		A.Hello1();
		A.Hello2();
		
		// CASE2 : ��ü(�ν��Ͻ�) ���̵� ����� �� �ִ�.
		System.out.println("<<CASE2>>");
		Spring02.Hello2();
		
		// CASE3 : static �������� ������ �� �ִ�.
		System.out.println("<<CASE3>>");
		Spring02 B = new Spring02();
		B.Hello1();
		B.Hello2();
		
		// CASE4 : Ŭ���� ������ �޼��� ȣ�� : static �޼��忡�� ������ �� �ִ�.
	}
}
