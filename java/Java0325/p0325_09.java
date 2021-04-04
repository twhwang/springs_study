class Human {
	void speak (){
		System.out.println("나는 사람이다.");
	}
}
class Hong extends Human {
	void speak() {
		System.out.println("나는 홍이다.");
	}
}
class Kang extends Human {
	void speak() {
		System.out.println("나는 강이다.");
	}
}
class Kim extends Human {
	void speak() {
		System.out.println("나는 김이다.");
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
