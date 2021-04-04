// 이너클래스의 제어자와 접근성
public class p0326_07 { 
  public static void main(String args[]) { 
    System.out.println(InstanceInner.CONST); 
    System.out.println(StaticInner.cv);
  }
  
  class InstanceInner { 
  // 이너 클래스는 static변수를 선언할 수 없다.
    int iv = 100; 
//    static int cv = 100;            // 에러! static변수를 선언할 수 없다. 
    final static int CONST = 100;   // final static은 상수이므로 허용
  } 

  static class StaticInner {
  // 이너 static 클래스는 static변수를 선언할 수 있다.
    int iv = 200; 
    static int cv = 200;    // static클래스만 static멤버를 정의할 수 있다. 
  } 

  void myMethod() { 
    class LocalInner {
    // 이너 클래스는 static변수를 선언할 수 없다.
      int iv = 300; 
//      static int cv = 300;             // 에러! static변수를 선언할 수 없다. 
      final static int CONST = 300;    // final static은 상수이므로 허용 
    } 
  } 


}