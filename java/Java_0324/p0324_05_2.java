// ��� p224 ����
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
		stv.channel = 10; // ����Tv�κ��� ��ӹ��� ���
		stv.channelUp(); // ����Tv�κ��� ��ӹ��� ���
		System.out.println(stv.channel);
		stv.displayCaption("Hello, world!");
		stv.caption = true; // �ڸ� ����� �Ҵ�.
		stv.displayCaption("Hello, world!");
		
	}
}
