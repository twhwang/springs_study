// 쓰레드의 I/0 블락킹
import javax.swing.JOptionPane;
public class p0402_03 {

	public static void main(String[] args) {
		T5 t5 = new T5();
		t5.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은" + input + "입니다.");
	}
}
class T5 extends Thread{
	public void run() {
		for (int i = 10 ; i > 0 ; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e) {}
		}
	} // run()
}