// checked ����, unchecked ����
public class p0329_02 {
	static void Test1 () throws RuntimeException {
		System.out.println("�׽�Ʈ 1");
		throw new RuntimeException(); // Unchecked ����
	}
	static void Test2 () throws Exception {
		System.out.println("�׽�Ʈ 2");
		throw new Exception(); // Checked ����
	}
	public static void main(String[] args) {
		Test1();
		try {
			Test2();
		} catch(Exception e){
			
		}

	}

}
