class C {
  // 생성자가 하나도 없으면 
  // 자바 컴파일러가 
  // 소스를 컴파일 할 때
  // 디폴트 생성자를 자동으로 생성한다.
}
class D extends C {
  D() {
    super();  // 부모 클래스의 디폴트 생성자 호출
    System.out.println("Hello class D");
  }
}

public class p0325_01_1 {
  public static void main(String[] args) {
    D Obj = new D();
  }
}