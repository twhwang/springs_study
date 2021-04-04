interface SmartPhone {
  public static final int iNum1 = 100;
  int iNum2 = 200; // public static final �����Ͽ����� �����
  
  public abstract void Calling();
  public  void Internet();
  abstract void Camera();
  
  static void PrintNumA() {  // �ڽ� Ŭ�������� ������(override) �Ұ�
    System.out.println(iNum1);
  }
  
  // �������̽��� �����Ǿ� �ִ� �޼ҵ� : ���� �������� �߻� Ŭ������ ����� ������ ��
  default void PrintNumB() {
    System.out.println(iNum1);
  }
}

public class Test005 {
  public static void main(String[] args) {
    // �������̽��� default �޼ҵ� ȣ��
    Galaxy aGalaxy = new Galaxy();
    aGalaxy.PrintNumB();
  }
  public static void main4(String[] args) {
    // �������̽��� static �޼ҵ� ȣ��
    SmartPhone.PrintNumA();
    //SmartPhone.PrintNumB();
  }
  public static void main3(String[] args) {
    // �������̽��� ��ӹ��� Ŭ������ ������ ���2
    // main2�� ��� ����
    // �迭�� ����Ͽ� �� ������ ����
    SmartPhone[] aSmartPhone = {new Galaxy(), new IPhone()};
    
    for(int i = 0; i< aSmartPhone.length; ++i) {
      aSmartPhone[i].Calling();
      aSmartPhone[i].Camera();
      aSmartPhone[i].Internet();
    }
    
  }
  public static void main2(String[] args) {
    // �������̽��� ��ӹ��� Ŭ������ ������ ���1
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
    // �������̽��� static ���� ����
    System.out.println(SmartPhone.iNum1);
    System.out.println(SmartPhone.iNum2);
    //SmartPhone.iNum1 = 300; // ���� : final�� �����
    //SmartPhone.iNum2 = 300; // ���� : final�� �����
  }
}



class Galaxy implements SmartPhone {
  @Override
  public void Calling() {
    System.out.println("������ ��ȭ...");
  }

  @Override
  public void Internet() {
    System.out.println("LTE...");
  }

  @Override
  public void Camera() {
    System.out.println("600�� ȭ��...");
  }
}

class IPhone implements SmartPhone {

  @Override
  public void Calling() {
    System.out.println("������ ��ȭ...");
  }

  @Override
  public void Internet() {
    System.out.println("LTE...");
  }

  @Override
  public void Camera() {
    System.out.println("500�� ȭ��...");
  }
}