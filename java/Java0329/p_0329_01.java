// ���� ó��
public class p_0329_01 {
	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(0/0); // 0���� ������ ���Ƿ� ArithmeticException�� �߻���Ŵ
			System.out.println(2); // ����� ������� �����ϸ鼭 ���ܰ� �߻��ϸ� try���� �����ϰ�
			System.out.println(3); // catch������ ����
		} catch (Exception e) {
			System.out.println(4); // ���ܰ� �߻����� ������ catch���� ��ġ�� �ʰ� ����
		} // try-catch���� ��
		System.out.println(5);

	}
}
