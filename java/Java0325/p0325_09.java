class Human {
	void speak (){
		System.out.println("���� ����̴�.");
	}
}
class Hong extends Human {
	void speak() {
		System.out.println("���� ȫ�̴�.");
	}
}
class Kang extends Human {
	void speak() {
		System.out.println("���� ���̴�.");
	}
}
class Kim extends Human {
	void speak() {
		System.out.println("���� ���̴�.");
	}
}
public class p0325_09 {
	public static void main(String[] args) {
		Hong h =  new Hong();
		Kang ka = new Kang();
		Kim  ki = new Kim();
		h.speak();
		ka.speak();
		ki.speak();
		/*
		 int iNum;
		 short sNum = 100;
		 iNum = sNum;
		 */
		Human hu = new Hong();
		hu.speak();
		
		
	}
}
