// �߻� Ŭ����
abstract class SpringC{
	abstract void On(); // �߻� �޼��� (=�̿ϼ��� �޼���)
						// �ַ� Ŭ������ ������ �� ����Ѵ�.
}
/* �߻�Ŭ������ ����� ��� 2���� �� 1������ �����ؾ� ��
 	1. �θ��� �߻� �޼��带 ��� ����
 	2. �ڽŵ� �߻� Ŭ������ �� */ 
class SpringD extends SpringC{
	void On() {
		// ���� 1
	}
}
abstract class SpringE extends SpringC{
	// ���� 2
}
public class p0326_03 {

	public static void main(String[] args) {
		// �ش� java���Ͽ��� �ν��Ͻ� ������ ������ Ŭ������ SpringD�� main Ŭ���� �ۿ� ����.

	}

}
