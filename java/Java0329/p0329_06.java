// Spring�� �����ڿ� �޼���
public class p0329_06 {

	public static void main(String[] args) {
		char a = ' ';       // �����̽��� ó��
		char b = 32;        // �����̽��� ó��
		// ASCII 31�� ���ϴ� ����ڷ� ȭ�鿡 ǥ�õ��� �ʴ´�.
		char c = '\u0000';  // ASCII 0 �Է�
		char d = 0;         // ASCII 0 �Է�
		char e = 10;        // ASCII 10 �Է� (Enter key)
		char f = 0x000A;    // ASCII 10 �Է� (Enter key)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
