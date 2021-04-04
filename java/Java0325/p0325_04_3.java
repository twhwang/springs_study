//final : 변수
class k{
	final int i = 100; // 해당 변수를 상수화한다.
}
public class p0325_04_3 {

	public static void main(String[] args) {
		k Obj = new k();
		Obj.i = 200; // k클래스의 i값을 수정할 수 없음
	}

}
