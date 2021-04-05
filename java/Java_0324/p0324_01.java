// 멤버변수의 초기화
public class p0324_01 {
	static {
		System.out.println("static { }");
	} // 클래스 초기화 블럭 *가장 먼저 수행됨
	
	{
		System.out.println("{ }");
	} // 인스턴스 초기화
	public p0324_01(){
		System.out.println("생성자"); // 가장 마지막으로 수행
	}  // *클래스 초기화 블럭은 1번만 수행되나 인스턴스 초기화 블럭은 인스턴스가 생성될 때마다 수행된다.
	public static void main(String[] args) { // 두번째로 수행됨
		System.out.println("p0324_01 bt = new p0324_01();");
		p0324_01 bt = new p0324_01();
		
		System.out.println("p0324_01 bt2 = new p0324_01();");
		p0324_01 bt2 = new p0324_01();
	}
}
