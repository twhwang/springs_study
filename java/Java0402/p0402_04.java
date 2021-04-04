// 대몬 쓰레드(Daemon Thread)
public class p0402_04 implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new p0402_04());
		t.setDaemon(true); // 종료를 위하여 필요한 부분
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
		System.out.println("프로그램을 종료합니다.");
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
		System.out.println("작업파일이 자동저장 되었습니다.");
	}
}
