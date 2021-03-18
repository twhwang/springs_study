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
