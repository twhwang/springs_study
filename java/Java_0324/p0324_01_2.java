// static 1 : static�� ���� �տ� ���̴� ��� - ����ƽ ����
class Spring01 {
	int iNum1 = 100; // �ν��Ͻ� ���� : ��ü(�ν��Ͻ�)�� �����Ǿ�� ����� �� �ִ�.
	static int iNum2 = 200; // ����ƽ(Ŭ����) ���� : ��ü�� ��� ����� �� �ִ�. / ���α׷� ���� ���� �̹� ����
}
public class p0324_01_2 {
	public static void main(String[] args) {
		// CASE1 : �ν��Ͻ� ������ ������ ������� ����� �� �ִ�.
		System.out.println("<<CASE1>>");
		Spring01 aSpr01 = new Spring01();
		System.out.println(aSpr01.iNum1);
		System.out.println(aSpr01.iNum2);
		
		// CASE2 : ��ü(�ν��Ͻ�) ���̵� ����� �� �ִ�.
		System.out.println("<<CASE2>>");
		System.out.println(Spring01.iNum2);
		
		// CASE3 : �������� ���Ǵ� Ŭ���� ����
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
