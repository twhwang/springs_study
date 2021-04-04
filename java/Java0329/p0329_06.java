// Spring의 생성자와 메서드
public class p0329_06 {

	public static void main(String[] args) {
		char a = ' ';       // 스페이스로 처리
		char b = 32;        // 스페이스로 처리
		// ASCII 31번 이하는 제어문자로 화면에 표시되지 않는다.
		char c = '\u0000';  // ASCII 0 입력
		char d = 0;         // ASCII 0 입력
		char e = 10;        // ASCII 10 입력 (Enter key)
		char f = 0x000A;    // ASCII 10 입력 (Enter key)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
