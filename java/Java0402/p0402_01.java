import java.util.Scanner;
public class p0402_01 {

	static void Test (int iNum) {
		iNum = iNum + 100; //지역변수 - Test 영역에서만 사용할 수 있는 변수
		System.out.println("Test 메서드, iNum = " + iNum);
	}
	
	public static void main(String[] args) {
		Scanner aScan = new Scanner(System.in);
		int iNum; //지역변수 - main 영역에서만 사용할 수 있는 변수
		
		System.out.println("Main에서 사용할 iNum값을 입력하시오 : ");
		iNum = aScan.nextInt();
		
		System.out.println("Test 메서드, iNum = " + iNum);
		Test(iNum);
		System.out.println("Test 메서드, iNum = " + iNum);

	}
}
