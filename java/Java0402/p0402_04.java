// ��� ������(Daemon Thread)
public class p0402_04 implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new p0402_04());
		t.setDaemon(true); // ���Ḧ ���Ͽ� �ʿ��� �κ�
		t.start();
		
		for (int i = 1 ; i <= 10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);
			if(i==5) {
				autoSave = true;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000);
			} catch(InterruptedException e) {}
			if(autoSave) autoSave();
		}
	}

	private void autoSave() {
		System.out.println("�۾������� �ڵ����� �Ǿ����ϴ�.");
	}
}
