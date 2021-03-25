//다형성
class n{
	void test() {
		System.out.println("부모 클래스의 메서드 입니다.");
	}
}
class o extends n{
	void test() {
		super.test();
	}
}
class shape{
	void draw() {
		System.out.println("도형이 그려짐");
	}
}
class triangle extends shape{
	void draw() {
		System.out.println("삼각형이 그려짐");
	}
}
class square extends shape{
	void draw() {
		System.out.println("사각형이 그려짐");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("원형이 그려짐");

	}
}
public class p0325_08 {

	public static void main(String[] args) {
		o Obj = new o();
		Obj.test();
		System.out.println("==========");
		
		triangle tri = new triangle();
		square sq = new square();
		circle cir = new circle();
		
		tri.draw();
		sq.draw();
		cir.draw();
	}
}
