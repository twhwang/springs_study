interface SmartPhone {
  public static final int iNum1 = 100;
  int iNum2 = 200; // public static final 생략하였지만 적용됨
  
  public abstract void Calling();
  public  void Internet();
  abstract void Camera();
  
  static void PrintNumA() {  // 자식 클래스에서 재정의(override) 불가
    System.out.println(iNum1);
  }
  
  // 인터페이스에 구현되어 있는 메소드 : 예외 조항으로 추상 클래스와 비슷한 모양새가 됨
  default void PrintNumB() {
    System.out.println(iNum1);
  }
}

public class Test005 {
  public static void main(String[] args) {
    // 인터페이스의 default 메소드 호출
    Galaxy aGalaxy = new Galaxy();
    aGalaxy.PrintNumB();
  }
  public static void main4(String[] args) {
    // 인터페이스의 static 메소드 호출
    SmartPhone.PrintNumA();
    //SmartPhone.PrintNumB();
  }
  public static void main3(String[] args) {
    // 인터페이스를 상속받은 클래스의 생성과 사용2
    // main2와 결과 동일
    // 배열을 사용하여 더 간단히 구현
    SmartPhone[] aSmartPhone = {new Galaxy(), new IPhone()};
    
    for(int i = 0; i< aSmartPhone.length; ++i) {
      aSmartPhone[i].Calling();
      aSmartPhone[i].Camera();
      aSmartPhone[i].Internet();
    }
    
  }
  public static void main2(String[] args) {
    // 인터페이스를 상속받은 클래스의 생성과 사용1
    Galaxy aGalaxy = new Galaxy();
    IPhone aIPhone = new IPhone();
    
    aGalaxy.Calling();
    aGalaxy.Camera();
    aGalaxy.Internet();
    
    aIPhone.Calling();
    aIPhone.Camera();
    aIPhone.Internet();
  }
  public static void main1(String[] args) {
    // 인터페이스의 static 변수 접근
    System.out.println(SmartPhone.iNum1);
    System.out.println(SmartPhone.iNum2);
    //SmartPhone.iNum1 = 300; // 에러 : final로 선언됨
    //SmartPhone.iNum2 = 300; // 에러 : final로 선언됨
  }
}



class Galaxy implements SmartPhone {
  @Override
  public void Calling() {
    System.out.println("갤럭시 전화...");
  }

  @Override
  public void Internet() {
    System.out.println("LTE...");
  }

  @Override
  public void Camera() {
    System.out.println("600만 화소...");
  }
}

class IPhone implements SmartPhone {

  @Override
  public void Calling() {
    System.out.println("아이폰 전화...");
  }

  @Override
  public void Internet() {
    System.out.println("LTE...");
  }

  @Override
  public void Camera() {
    System.out.println("500만 화소...");
  }
}