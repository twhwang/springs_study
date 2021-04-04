// 예외 발생시키기
public class p0329_01_3 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴"); // 예외 객체를 생성
			System.out.println("----절취선----");
			throw e; // 생성한 예외 객체를 발생
		} catch (Exception e){
			System.out.println("[에러 메시지] " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상적으로 종료");
	}
}
