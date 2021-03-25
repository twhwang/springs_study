// 접근 제어자
class l{
	public    int iNum1 = 100; // 어떠한 경우라도 접근할 수 있다.
	protected int iNum2 = 100; // 상속 / 같은 패키지 내에서만 접근할 수 있다.
	          int iNum3 = 100; // 같은 패키지 내에서만 접근할 수 있다.
	private   int iNum4 = 100; // 같은 클래스 내에서만 접근할 수 있다.
}
public class p0325_05 {

	public static void main(String[] args) {
		l obj = new l();
		obj.iNum1 = 200; // 제약이 없음
		obj.iNum2 = 200; // 같은 패키지이기에 가능 (상속한 경우도 가능)
		obj.iNum3 = 200; // 같은 패키지이기에 가능
		obj.iNum4 = 200; // 클래스가 다르기에 접근이 불가능

	}

}
