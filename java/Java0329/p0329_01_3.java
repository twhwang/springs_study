// ���� �߻���Ű��
public class p0329_01_3 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻���Ŵ"); // ���� ��ü�� ����
			System.out.println("----���뼱----");
			throw e; // ������ ���� ��ü�� �߻�
		} catch (Exception e){
			System.out.println("[���� �޽���] " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���������� ����");
	}
}
