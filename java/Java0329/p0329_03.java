// finally �� - ���ܰ� �߻��ϵ� ���� �ʵ� �ݵ�� �����ؾ��ϴ� ��
public class p0329_03 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			//throw new Exception(); << ���� ���� �߻�, catch�� �����
		} catch(Exception e) {
			System.out.println(5);
		} finally {
			System.out.println(6); // ���ܰ� �ִ� ���ܰ� ���� �ݵ�� ����
		}
		System.out.println(7);
	}
}
