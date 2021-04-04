class SpringA{
	static int iNum = 100;
	static synchronized void add() {
		++iNum;
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {}
	}
}
public class p0402_06 implements Runnable {
	
	public static void main(String[] args) {
		Thread aTH1 = new Thread(new p0402_06(), "Plus");
		aTH1.start();
		Thread aTH2 = new Thread(new p0402_06(), "Plus");
		aTH2.start();
		Thread aTH3 = new Thread(new p0402_06(), "Plus");
		aTH3.start();
		Thread aTH4 = new Thread(new p0402_06(), "Plus");
		aTH4.start();
		
		try {
			aTH1.join();
			aTH2.join();
			aTH3.join();
			aTH4.join();
		} catch (InterruptedException e) {}
		System.out.println(SpringA.iNum);
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; ++i) {
			SpringA.add();
		}
	}
}
