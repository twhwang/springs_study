//다형성을 활용한 기법
class instrument {
	void play() {
		System.out.println("악기를 연주");
	}
}
class violin extends instrument {
	void play() {
		System.out.println("바이올린 연주");
	}
}
class piano extends instrument {
	void play() {
		System.out.println("피아노 연주");
	}
}
class flute extends instrument {
	void play() {
		System.out.println("플룻 연주");
	}
}
public class p0325_10 {
	public static void main1(String[] args) {
		instrument [] aInst = new instrument [3];
		aInst[0] = new violin();
		aInst[1] = new piano();
		aInst[2] = new flute();
		
		aInst[0].play();
		aInst[1].play();
		aInst[2].play();

	}
	public static void main(String[] args) {
		instrument [] aInst = {new violin(), new piano(), new flute()};
		for(int i = 0 ; i < aInst.length ; i++) {
			aInst[i].play(); //배열과 반복문을 활용하여 코드의 양을 줄일 수 있다.
			// main1 -> main
		}
	}
}
