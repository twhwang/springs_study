// �̳�Ŭ������ �����ڿ� ���ټ�
public class p0326_07 { 
  public static void main(String args[]) { 
    System.out.println(InstanceInner.CONST); 
    System.out.println(StaticInner.cv);
  }
  
  class InstanceInner { 
  // �̳� Ŭ������ static������ ������ �� ����.
    int iv = 100; 
//    static int cv = 100;            // ����! static������ ������ �� ����. 
    final static int CONST = 100;   // final static�� ����̹Ƿ� ���
  } 

  static class StaticInner {
  // �̳� static Ŭ������ static������ ������ �� �ִ�.
    int iv = 200; 
    static int cv = 200;    // staticŬ������ static����� ������ �� �ִ�. 
  } 

  void myMethod() { 
    class LocalInner {
    // �̳� Ŭ������ static������ ������ �� ����.
      int iv = 300; 
//      static int cv = 300;             // ����! static������ ������ �� ����. 
      final static int CONST = 300;    // final static�� ����̹Ƿ� ��� 
    } 
  } 


}