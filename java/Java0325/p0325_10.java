//�������� Ȱ���� ���
class instrument {
	void play() {
		System.out.println("�Ǳ⸦ ����");
	}
}
class violin extends instrument {
	void play() {
		System.out.println("���̿ø� ����");
	}
}
class piano extends instrument {
	void play() {
		System.out.println("�ǾƳ� ����");
	}
}
class flute extends instrument {
	void play() {
		System.out.println("�÷� ����");
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
			aInst[i].play(); //�迭�� �ݺ����� Ȱ���Ͽ� �ڵ��� ���� ���� �� �ִ�.
			// main1 -> main
		}
	}
}
