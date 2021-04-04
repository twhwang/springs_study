// suspend, resume, stop
// ����� deprecated�� �޼����� '������ ���Ǿ�����, ����� �������� �ʴ´�'
public class p0402_05 {
	public static void main(String[] args) {
		RunT rt = new RunT();
		Thread t1 = new Thread(rt, "*");
		Thread t2 = new Thread(rt, "**");
		Thread t3 = new Thread(rt, "***");
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(2000);
			t1.suspend(); // t1 ��� �ߴ�
			Thread.sleep(2000);
			t2.suspend();
			Thread.sleep(3000);
			t1.resume(); // t1 �ٽ� ����
			Thread.sleep(3000);
			t1.stop(); // t1 ���� ����
			t2.stop();
			Thread.sleep(2000);
			t3.stop();
		} catch(InterruptedException e) {}
		
	}
}
class RunT implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}
