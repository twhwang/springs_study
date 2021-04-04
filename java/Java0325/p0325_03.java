//import문
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.random;
public class p0325_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력하시오");
		String input = scan.nextLine();
		System.out.println("[["+ input +"]]");
		
		out.println(random());
		
	}
}
