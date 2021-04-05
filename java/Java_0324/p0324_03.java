// 이너클래스 (클래스 안의 클래스)
class AA{
	int aN = 100;
	class BB{
		int bN = 200;
	}
}
public class p0324_03 {
	public static void main(String[] args) {
		AA obj1 = new AA();
		AA.BB obj2 = obj1.new BB();
		System.out.println(obj1.aN);
		System.out.println(obj2.bN);
	}
}
