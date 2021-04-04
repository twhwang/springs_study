// checked 예외, unchecked 예외
public class p0329_01_4 {
	public static void main(String[] args) {
		//throw new Exception(); : Checked 예외 - 실행이 되지 않음
		throw new RuntimeException(); // : Unchecked 예외 - 실행은 되나 예외 발생
	}
}
