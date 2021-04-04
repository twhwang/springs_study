//final : 메서드
class i {
	final void test() {
		// override가 불가하다
	}
}
class j extends i{
	void test() {
		// 부모(i)의 test를 오버라이딩 할 수 없음
		// 다른 이름의 메서드를 생성해야만 함
	}
}
public class p0325_04_2 {
	public static void main(String[] args) {

	}
}
