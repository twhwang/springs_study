// finally 블럭 - 예외가 발생하든 하지 않든 반드시 실행해야하는 블럭
public class p0329_03 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			//throw new Exception(); << 강제 예외 발생, catch가 실행됨
		} catch(Exception e) {
			System.out.println(5);
		} finally {
			System.out.println(6); // 예외가 있던 예외가 없던 반드시 실행
		}
		System.out.println(7);
	}
}
