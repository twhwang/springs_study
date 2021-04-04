// 예외 처리(2)
public class p_0329_01_2 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			// ArithmeticException 예외가 발생
			// JVM은 ArithmeticException 객체를 생성하고
			// 프로그램의 흐름을 catch로 이동 시킨다.
			// 그리고 객체와 해당하는 catch문을 찾는다.
			// 해당하는 catch문을 찾으면 ArithmeticException 객체를
			// 함수 인자처럼 전달한다.
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
				System.out.println("ArithmeticExtion");
			}
		} catch (RuntimeException e) {
			System.out.println("RunTimeException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(5);
	}
}
