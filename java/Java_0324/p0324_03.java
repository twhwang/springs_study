// �̳�Ŭ���� (Ŭ���� ���� Ŭ����)
class AA{
	int aN = 100;
	class BB{
		int bN = 200;
	}
}
public class p0324_03 {
	public static void main(String[] args) {
		AA obj1 = new AA();
		AA.BB obj2 = obj1.new BB();
		System.out.println(obj1.aN);
		System.out.println(obj2.bN);
	}
}
