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

public class Ex2_10_3 {
	public static void main(String[] args) {
		byte bNum1 = 127;
		System.out.println(bNum1);
		++bNum1; // 2의 보수기법에 의해 -128 (최소값)으로 저장됨
		System.out.println(bNum1);
	}
}

public class Ex2_10_4 {
	public static void main(String[] args) {
		char cNum0 = "Apple".charAt(0);
		char cNum1 = "Apple".charAt(1);
		char cNum2 = "Apple".charAt(2);
		char cNum3 = "Apple".charAt(3);
		char cNum4 = "Apple".charAt(4);
		
		System.out.println(cNum0);
		System.out.println(cNum1);
		System.out.println(cNum2);
		System.out.println(cNum3);
		System.out.println(cNum4);
	}

}

// 연산자 (증감 연산자)
public class Ex2_11 {
	public static void main(String[] args) {
		
		int iNum1 = 100;
		int iNum2 = 100;
		int iNum3 = 200;
		int iNum4 = 200;
		
		++iNum1;
		iNum2++;
		
		--iNum3;
		iNum4--;
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		System.out.println("-----Borderline-----");
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}
