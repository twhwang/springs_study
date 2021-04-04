// 추상 클래스
abstract class SpringC{
	abstract void On(); // 추상 메서드 (=미완성된 메서드)
						// 주로 클래스를 설계할 때 사용한다.
}
/* 추상클래스를 상속할 경우 2가지 중 1가지를 선택해야 함
 	1. 부모의 추상 메서드를 모두 구현
 	2. 자신도 추상 클래스가 됨 */ 
class SpringD extends SpringC{
	void On() {
		// 선택 1
	}
}
abstract class SpringE extends SpringC{
	// 선택 2
}
public class p0326_03 {

	public static void main(String[] args) {
		// 해당 java파일에서 인스턴스 생성이 가능한 클래스는 SpringD와 main 클래스 밖에 없다.

	}

}
