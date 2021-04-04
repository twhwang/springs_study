// 예외 처리
public class p_0329_01 {
	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(0/0); // 0으로 나누어 고의로 ArithmeticException을 발생시킴
			System.out.println(2); // 명령을 순서대로 수행하면서 예외가 발생하면 try문을 중지하고
			System.out.println(3); // catch문으로 점프
		} catch (Exception e) {
			System.out.println(4); // 예외가 발생하지 않으면 catch블럭을 거치지 않고 수행
		} // try-catch문의 끝
		System.out.println(5);

	}
}
