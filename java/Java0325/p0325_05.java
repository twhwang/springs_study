// ���� ������
class l{
	public    int iNum1 = 100; // ��� ���� ������ �� �ִ�.
	protected int iNum2 = 100; // ��� / ���� ��Ű�� �������� ������ �� �ִ�.
	          int iNum3 = 100; // ���� ��Ű�� �������� ������ �� �ִ�.
	private   int iNum4 = 100; // ���� Ŭ���� �������� ������ �� �ִ�.
}
public class p0325_05 {

	public static void main(String[] args) {
		l obj = new l();
		obj.iNum1 = 200; // ������ ����
		obj.iNum2 = 200; // ���� ��Ű���̱⿡ ���� (����� ��쵵 ����)
		obj.iNum3 = 200; // ���� ��Ű���̱⿡ ����
		obj.iNum4 = 200; // Ŭ������ �ٸ��⿡ ������ �Ұ���

	}

}
