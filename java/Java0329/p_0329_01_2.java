// ���� ó��(2)
public class p_0329_01_2 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			// ArithmeticException ���ܰ� �߻�
			// JVM�� ArithmeticException ��ü�� �����ϰ�
			// ���α׷��� �帧�� catch�� �̵� ��Ų��.
			// �׸��� ��ü�� �ش��ϴ� catch���� ã�´�.
			// �ش��ϴ� catch���� ã���� ArithmeticException ��ü��
			// �Լ� ����ó�� �����Ѵ�.
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
				System.out.println("ArithmeticExtion");
			}
		} catch (RuntimeException e) {
			System.out.println("RunTimeException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(5);
	}
}
