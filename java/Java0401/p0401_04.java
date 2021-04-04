public class p0401_04 {
	public static void main(String[] args) {
		Th1 t1 = new Th1();
		Thread t2 = new Thread(new Th2());
		
		t1.start();
		t2.start();

	}
}
class Th1 extends Thread{
	public void run( ) {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(getName()+":::"+ i ); // ������ Thread�� getName ȣ��
		}
	}
}
class Th2 implements Runnable{
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(Thread.currentThread().getName()+":::"+ i); // ���� ���� ���� Thread�� ��ȯ
		}
	}
}
