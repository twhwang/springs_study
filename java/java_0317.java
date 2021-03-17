// 사칙 연산자
public class p0317_01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		// int(정수)타입은 소수점을 저장하지 못하므로 소수점 이하 자리는 버린다.
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		// 올바른 연산결과를 얻기 위해서 한 쪽을 실수형으로 형변환하여 정확한 결과 값을 얻는다.
		
		System.out.println(5/2);
		System.out.println(5/(float)2);
		
	}
}

// 반올림 Math.round()
public class p0317_02 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		
		System.out.println(pi);
		System.out.println(shortPi);
		
		long result = Math.round(4.52);
		System.out.println(result);
	}
}

// 나머지 연산자
public class p0317_03 {
	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x/y, x%y);
		
		System.out.println(10%8);
		System.out.println(10%-8);
		System.out.println(-10%8);
		
	}
}

// 비교 연산자
public class p0317_04 {
	public static void main(String[] args) {
		boolean bNum1 = 5 < 6;
		boolean bNum2 = 3 < 2;
		boolean bNum3 = (1+2) < (2+0);
		
		System.out.println(bNum1);
		System.out.println(bNum2);
		System.out.println(bNum3);
	}
}

// 문자열의 비교
public class p0317_05 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\" ==\"abc\" ? %b%n", "abc" == "abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1 == "abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2 == "abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str1.equals(\"ABC\") ? %b%n", str1.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str1.equalsIgnoreCase("ABC"));
	}
}

// 논리 연산자
import java.util.Scanner;
public class p0317_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
		scanner.close();
	}
}
---
import java.util.Scanner;
public class p0317_06_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳 1글자를 입력하시오. : ");
		String str = scanner.nextLine();
		
		boolean res;
		
		res = ('Z' == str.charAt(0));
		
		System.out.println("입력한 글자는 Z 입니다. : " + res);
		
		scanner.close();
	}
}
---
import java.util.Scanner;
public class p0317_06_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하시오. : ");
		int Num = scanner.nextInt();
		
		boolean res;
		
		res = (Num % 3 == 0);
		System.out.println("입력한 숫자는 3의 배수입니다. : " + res);
		res = (Num % 5 == 0);
		System.out.println("입력한 숫자는 5의 배수입니다. : " + res);
		res = (Num % 7 == 0);
		System.out.println("입력한 숫자는 7의 배수입니다. : " + res);
		
		scanner.close();
	}
}
