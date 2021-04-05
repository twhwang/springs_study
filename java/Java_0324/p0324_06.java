class Instrument {
	void play() {
		System.out.println("연주하다");
	}
}
class Piano extends Instrument{
	void play() {
		System.out.println("피아노를 연주하다"); // 오버라이딩
	}
}
class Violin extends Instrument{
	void play() {
		System.out.println("바이올린을 연주하다"); // 오버라이딩
	}
}
class Flute extends Instrument{
	void play() {
		System.out.println("플룻을 연주하다"); // 오버라이딩
	}
} // 오버라이딩 : 상속받은 메서드의 내용을 변경하는 것
public class p0324_06 {
	public static void main(String[] args) {
		Piano aPiano = new Piano();
		Violin aViolin = new Violin();
		Flute aFlute = new Flute();
		
		aPiano.play();
		aViolin.play();
		aFlute.play();
		
	}
}
