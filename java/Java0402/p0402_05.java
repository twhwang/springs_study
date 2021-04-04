// suspend, resume, stop
// 현재는 deprecated된 메서드들로 '전에는 사용되었으나, 현재는 권장하지 않는다'
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
			t1.suspend(); // t1 잠시 중단
			Thread.sleep(2000);
			t2.suspend();
			Thread.sleep(3000);
			t1.resume(); // t1 다시 동작
			Thread.sleep(3000);
			t1.stop(); // t1 강제 종료
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
