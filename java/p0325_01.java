class A {
  int iNum = 100;          // class A�� iNum : �ν��Ͻ� ����
}
class B extends A {
  int iNum = 200;          // class B�� iNum : �ν��Ͻ� ����
  void Test(int iNum) {
    System.out.println(iNum);      // Test�� iNum : ���� ����
    System.out.println(this.iNum);    // class B�� iNum : �ν��Ͻ� ����
    System.out.println(super.iNum);    // class A�� iNum : �ν��Ͻ� ����
  }
}

public class p0325_01 {

  public static void main(String[] args) {
    B Obj = new B();
    Obj.Test(300);
  }

}
