class Instrument {
	void play() {
		System.out.println("�����ϴ�");
	}
}
class Piano extends Instrument{
	void play() {
		System.out.println("�ǾƳ븦 �����ϴ�"); // �������̵�
	}
}
class Violin extends Instrument{
	void play() {
		System.out.println("���̿ø��� �����ϴ�"); // �������̵�
	}
}
class Flute extends Instrument{
	void play() {
		System.out.println("�÷��� �����ϴ�"); // �������̵�
	}
} // �������̵� : ��ӹ��� �޼����� ������ �����ϴ� ��
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
