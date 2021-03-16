import java.util.Scanner; // 콘솔에서 Scanner 호출

public class Ex2_10_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체
		
		System.out.println("문자열 입력(넥스트라인): "); // Enter를 입력하기 전까지 작성한 문자열을 모두 리턴
		String str1 = scanner.nextLine();
		System.out.println(str1);
		
		System.out.println("문자열 입력(넥스트): "); // Space(공백)을 입력하기 전까지 작성한 문자열을 리턴
		String str2 = scanner.next();
		System.out.println(str2);
		
		System.out.println("정수 입력: ");
		int i = scanner.nextInt();
		System.out.println(i);
		
		System.out.println("실수 입력: ");
		double j = scanner.nextDouble();
		System.out.println(j);
		scanner.close();
	}
}

public class Ex2_7_2 {
	public static void main(String[] args) {
		int a = 5;
		String s = "안녕하세요";
		System.out.printf("변수 안에 저장된 숫자는 %d입니다.\n", a);
		System.out.printf("변수 안에 저장된 문자는 '%s'입니다.", s);
	}
}

