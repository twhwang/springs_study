// 상속과 생성자
// 1. 부모 클래스의 디폴트 생성자 자동 호출
class 부모{
	부모(){
		System.out.println("부모님 소환");
	}
	부모(String pname){
		this.name = pname;
		System.out.println(pname + " 불러오기");
	}
}
class 자식 extends 부모{
	String name;
	자식(){
		System.out.println("자식 불러오기");
	}
	자식(String name){
		this.name = name;
		System.out.println(name + " 불러오기");
	}
	자식(String name, String pName){
		super();
		this.name = name;
		System.out.println(name + " 불러오기");
	}
}
public class p0324_07 {
	public static void main(String[] args) {
		자식 aChild1 = new 자식();
		자식 aChild2 = new 자식("홍길동");
		자식 aChild3 = new 자식("홍상직");
	}
}
/*
//상속할 경우 생성자에 관한 여러가지들 : 부모 클래스의 디폴트 생성자 자동 호출
public class Test008 {
public static void main(String[] args) {
 //Child aChild1 = new Child();
 //Child aChild2 = new Child("홍길동");
 Child aChild3 = new Child("홍길동", "홍상직");
}
}

class Parent {
String name;
Parent() {
 System.out.println("부모 객체 생성");
}
Parent(String name) {
 this.name = name;
 System.out.println(name + " 객체 생성");
}
}

class Child extends Parent {
String name;
Child() {
 super(); // 부모의 디폴트 생성자 Parent()를 호출
 System.out.println("자식 객체 생성");
}
Child(String name) {
 super(); // 부모의 디폴트 생성자 Parent()를 호출
 this.name = name;
 System.out.println(name + " 객체 생성");
}
Child(String name, String parentName) {
 super(parentName);// 부모의 생성자 Parent(String name)를 호출
 this.name = name;
 System.out.println(name + " 객체 생성");
}
}
*/