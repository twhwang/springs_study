class C {
  // �����ڰ� �ϳ��� ������ 
  // �ڹ� �����Ϸ��� 
  // �ҽ��� ������ �� ��
  // ����Ʈ �����ڸ� �ڵ����� �����Ѵ�.
}
class D extends C {
  D() {
    super();  // �θ� Ŭ������ ����Ʈ ������ ȣ��
    System.out.println("Hello class D");
  }
}

public class p0325_01_1 {
  public static void main(String[] args) {
    D Obj = new D();
  }
}