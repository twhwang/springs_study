import java.util.Scanner;
public class p0402_01 {

	static void Test (int iNum) {
		iNum = iNum + 100; //�������� - Test ���������� ����� �� �ִ� ����
		System.out.println("Test �޼���, iNum = " + iNum);
	}
	
	public static void main(String[] args) {
		Scanner aScan = new Scanner(System.in);
		int iNum; //�������� - main ���������� ����� �� �ִ� ����
		
		System.out.println("Main���� ����� iNum���� �Է��Ͻÿ� : ");
		iNum = aScan.nextInt();
		
		System.out.println("Test �޼���, iNum = " + iNum);
		Test(iNum);
		System.out.println("Test �޼���, iNum = " + iNum);

	}
}
