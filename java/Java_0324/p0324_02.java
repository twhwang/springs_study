// static 3 : �׷��ٸ� main��?????
/*
 * 1. main �޼���� Ŭ���� �ȿ� ����� ����.
 * 2. main �޼���� static���� ����Ǿ�� �Ѵ�. JVM���� ��ü ���� ���� ȣ�������
 * JVM�� ȣ���� �� => Test003.main("");
 */
public class p0324_02 {
  int iNum1 = 100;// �ν��Ͻ� ����
  void test1() {  // �ν��Ͻ� �޼���
  }

  static int iNum2 = 100;  // static ����
  static void test2() {  // static �޼���
  }

 public static void main(String[] args) {
    System.out.println("���� ��...");
    //test1();   // �ν��Ͻ� �޼��� ���� �Ұ�
    test2();  // static �޼���
    
    //iNum1 = 200;  // �ν��Ͻ� ������ ���� �Ұ�
    iNum2 = 200;  // static ������ ���� ����
    
  }
}