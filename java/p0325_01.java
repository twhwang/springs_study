class A {
  int iNum = 100;          // class A의 iNum : 인스턴스 변수
}
class B extends A {
  int iNum = 200;          // class B의 iNum : 인스턴스 변수
  void Test(int iNum) {
    System.out.println(iNum);      // Test의 iNum : 지역 변수
    System.out.println(this.iNum);    // class B의 iNum : 인스턴스 변수
    System.out.println(super.iNum);    // class A의 iNum : 인스턴스 변수
  }
}

public class p0325_01 {

  public static void main(String[] args) {
    B Obj = new B();
    Obj.Test(300);
  }

}
