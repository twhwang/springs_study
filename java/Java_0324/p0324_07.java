// ��Ӱ� ������
// 1. �θ� Ŭ������ ����Ʈ ������ �ڵ� ȣ��
class �θ�{
	�θ�(){
		System.out.println("�θ�� ��ȯ");
	}
	�θ�(String pname){
		this.name = pname;
		System.out.println(pname + " �ҷ�����");
	}
}
class �ڽ� extends �θ�{
	String name;
	�ڽ�(){
		System.out.println("�ڽ� �ҷ�����");
	}
	�ڽ�(String name){
		this.name = name;
		System.out.println(name + " �ҷ�����");
	}
	�ڽ�(String name, String pName){
		super();
		this.name = name;
		System.out.println(name + " �ҷ�����");
	}
}
public class p0324_07 {
	public static void main(String[] args) {
		�ڽ� aChild1 = new �ڽ�();
		�ڽ� aChild2 = new �ڽ�("ȫ�浿");
		�ڽ� aChild3 = new �ڽ�("ȫ����");
	}
}
/*
//����� ��� �����ڿ� ���� ���������� : �θ� Ŭ������ ����Ʈ ������ �ڵ� ȣ��
public class Test008 {
public static void main(String[] args) {
 //Child aChild1 = new Child();
 //Child aChild2 = new Child("ȫ�浿");
 Child aChild3 = new Child("ȫ�浿", "ȫ����");
}
}

class Parent {
String name;
Parent() {
 System.out.println("�θ� ��ü ����");
}
Parent(String name) {
 this.name = name;
 System.out.println(name + " ��ü ����");
}
}

class Child extends Parent {
String name;
Child() {
 super(); // �θ��� ����Ʈ ������ Parent()�� ȣ��
 System.out.println("�ڽ� ��ü ����");
}
Child(String name) {
 super(); // �θ��� ����Ʈ ������ Parent()�� ȣ��
 this.name = name;
 System.out.println(name + " ��ü ����");
}
Child(String name, String parentName) {
 super(parentName);// �θ��� ������ Parent(String name)�� ȣ��
 this.name = name;
 System.out.println(name + " ��ü ����");
}
}
*/