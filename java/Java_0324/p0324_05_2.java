// 상숙 p224 예제
class Tv{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}

class smartTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class p0324_05_2 {
	public static void main(String[] args) {
		smartTv stv = new smartTv();
		stv.channel = 10; // 조상Tv로부터 상속받은 멤버
		stv.channelUp(); // 조상Tv로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, world!");
		stv.caption = true; // 자막 기능을 켠다.
		stv.displayCaption("Hello, world!");
		
	}
}
