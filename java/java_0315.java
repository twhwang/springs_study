// Ex2_7.java
// printf를 이용한 출력
public class Ex2_7 {
	public static void main(String[] args) {
		String url = "wwww.naver.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url); //문자열의 길이만큼 출력공간을 확보
		System.out.printf("[%20s]%n", url); //최소 공간 %(글자수)s만큼의 출력공간 확보 (우측 정렬)
		System.out.printf("[%-20s]%n", url); //최소 공간 %(글자수)s만큼의 출력공간 확보 (좌측 정렬)
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
	}
}


// Ex2_3_2.java
public class Ex2_3_2 {
	public static void main(String[] args) {
		int x = 5;
		System.out.println(" "+x+"ww");
		x = 10;
		System.out.println("ww"+x+"w");
	}
}

// Ex2_10.java
import java.util.Scanner; // Scanner 클래스 사용을 위해 추가

public class Ex2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner 클래스의 객체를 생성
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
		// nextLine()을 통해 입력대기 상태에 있다가 입력받은 내용을 문자열로 반환
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		// 입력받은 문자열을 숫자로 변환하기 위해서는 Integer.parseInt() 메서드를 사용
		
		System.out.println("입력내용:"+input);
		System.out.printf("num=%d%n", num);
		scanner.close();
	}
}

