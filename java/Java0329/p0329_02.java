// checked 예외, unchecked 예외
public class p0329_02 {
	static void Test1 () throws RuntimeException {
		System.out.println("테스트 1");
		throw new RuntimeException(); // Unchecked 예외
	}
	static void Test2 () throws Exception {
		System.out.println("테스트 2");
		throw new Exception(); // Checked 예외
	}
	public static void main(String[] args) {
		Test1();
		try {
			Test2();
		} catch(Exception e){
			
		}

	}

}
