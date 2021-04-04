// 싱글쓰레드와 멀티쓰레드
public class p0402_02 {

	public static long startTime = 0;

	public static void main(String[] args) {
		Th1 t1 = new Th1();
		t1.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0 ; i < 300 ; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.print("소요시간1 : " + (System.currentTimeMillis() - p0402_02.startTime ));
	}

}
class Th1 extends Thread{
	public void run( ) {
		for(int i = 0 ; i < 300 ; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.print("소요시간2 : " + (System.currentTimeMillis() - p0402_02.startTime ));
	}
}