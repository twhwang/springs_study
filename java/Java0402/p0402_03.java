// �������� I/0 ���ŷ
import javax.swing.JOptionPane;
public class p0402_03 {

	public static void main(String[] args) {
		T5 t5 = new T5();
		t5.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ����" + input + "�Դϴ�.");
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