// ���ʸ�
public class p0330_01 {
	public static void main(String[] args) {
		String iTemp = DataToString(1024);
		System.out.println(iTemp);
		
		String sTemp = DataToString("����");
		System.out.println(sTemp);
		
		String dTemp = DataToString(3.14);
		System.out.println(dTemp);
	}
	// �޼ҵ� �����ε� ���
	static int add(int iNum1, int iNum2) {
		return iNum1 + iNum2;
	}
	static String DataToString(int iNum) {
		return "[" + iNum + "]";
	}
	// ���ʸ� ��� (�޼��忡 ����)
	static <T> String DataToString (T iNum) {
		return "[" + iNum + "]";
	}
}
