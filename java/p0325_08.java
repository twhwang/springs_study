//������
class n{
	void test() {
		System.out.println("�θ� Ŭ������ �޼��� �Դϴ�.");
	}
}
class o extends n{
	void test() {
		super.test();
	}
}
class shape{
	void draw() {
		System.out.println("������ �׷���");
	}
}
class triangle extends shape{
	void draw() {
		System.out.println("�ﰢ���� �׷���");
	}
}
class square extends shape{
	void draw() {
		System.out.println("�簢���� �׷���");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("������ �׷���");

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
