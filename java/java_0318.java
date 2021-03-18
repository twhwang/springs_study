// 중첩 if문
import java.util.Scanner;
public class p0318_01 {
	public static void main(String[] args) {
		int score = 0; // 점수 변수
		char grade = ' ', opt = ' '; // 학점 변수
		
		System.out.print("점수를 입력하시오. >");
		
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt(); // 화면을 통해 입력받은 점수를 score에 저장
		
		System.out.printf("당신의 점수는 %d입니다.", score);
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
		
		scan.close();
	}
}

// switch문
import java.util.Scanner;
public class p0318_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("사칙 연산 기호를 입력하시오. >");
		String dataStr = scan.nextLine();
		
		/*
		if(dataStr.charAt(0)=='+') {
			System.out.printf("입력하신 기호는 '%s'입니다.%n", dataStr);
			System.out.print("더하기");
		} else if(dataStr.charAt(0)=='-') {
			System.out.printf("입력하신 기호는 '%s'입니다.%n", dataStr);
			System.out.print("빼기");
		} else if(dataStr.charAt(0)=='*') {
			System.out.printf("입력하신 기호는 '%s'입니다.%n", dataStr);
			System.out.print("곱하기");
		} else if(dataStr.charAt(0)=='/') {
			System.out.printf("입력하신 기호는 '%s'입니다.%n", dataStr);
			System.out.print("나누기");
		}
		*/
		
		switch(dataStr.charAt(0)) {
			case '+' : 
				System.out.printf("입력하신 기호는 '%s'입니다.%n", dataStr);
				System.out.print("더하기");
				break;
			case '-' : 
				System.out.printf("입력하신 기호는 '%s'입니다.%n", dataStr);
				System.out.print("빼기");
				break;
			case '*' : 
				System.out.printf("입력하신 기호는 '%s'입니다.%n", dataStr);
				System.out.print("곱하기");
				break;
			case '/' : 
				System.out.printf("입력하신 기호는 '%s'입니다.%n", dataStr);
				System.out.print("나누기");
				break;
			default :
				System.out.print("잘못 입력하였습니다.");
		}
		
		scan.close();
	}
}

import java.util.Scanner;
// switch문
public class p0318_02_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = 0; // 점수를 저장하는 변수
		char grade = ' '; // 등급을 저장하는 변수
		
		System.out.print("점수를 입력하시오> ");
		score = scan.nextInt(); // 입력받은 숫자를 변수 score에 저장
		
		switch(score/10) {
			case 10 :
				grade = 'A';
			break;
			case 9 : 
				grade = 'A';
			break;
			case 8 : 
				grade = 'B';
			break;
			case 7 : 
				grade = 'C';
			break;
			default :
				grade = 'D';
		}
		System.out.println("당신의 학점은 " + grade + " 입니다.");
		
		/*
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >=70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 " + grade + " 입니다.");
		*/
		scan.close();
	}

}

import java.util.Scanner;
public class p0318_02_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하시오. > ");
		
		int month = scan.nextInt();
		
		switch(month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("지금은 '봄' 입니다.");
			break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("지금은 '여름' 입니다.");
			break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("지금은 '가을' 입니다.");
			break;
			default:
			case 12 :
			case 1 :
			case 2 :
				System.out.println("지금은 '겨울' 입니다.");
		}
		scan.close();
	}
}
