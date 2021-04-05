// static 3 : 그렇다면 main은?????
/*
 * 1. main 메서드는 클래스 안에 만들어 진다.
 * 2. main 메서드는 static으로 선언되어야 한다. JVM에서 객체 생성 없이 호출됨으로
 * JVM가 호출할 때 => Test003.main("");
 */
public class p0324_02 {
  int iNum1 = 100;// 인스턴스 변수
  void test1() {  // 인스턴스 메서드
  }

  static int iNum2 = 100;  // static 변수
  static void test2() {  // static 메서드
  }

 public static void main(String[] args) {
    System.out.println("실행 중...");
    //test1();   // 인스턴스 메서드 접근 불가
    test2();  // static 메서드
    
    //iNum1 = 200;  // 인스턴스 변수는 접근 불가
    iNum2 = 200;  // static 변수만 접근 가능
    
  }
}