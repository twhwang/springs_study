import java.io.IOException;
import java.net.*;
public class p0401_01 {

	public static void main(String[] args) {
		ServerSocket aSK;
		System.out.println("������ �����մϴ�.....");
		try {
			aSK = new ServerSocket(12141); // 1024 < ��Ʈ��ȣ < 65536
			System.out.println("Ŭ���̾�Ʈ ������ ����ϰ� �ֽ��ϴ�......");
			Socket aSocket = aSK.accept(); // ���� ���� (���� ������ ���α׷��� �����)
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			
			System.out.print(aSocket.getLocalAddress());
			System.out.println(" : "+ aSocket.getPort());
			
			aSK.close();
			aSocket.close();
		} catch (IOException e) {
			System.out.println("���� ������ ���� �Ͽ����ϴ�.");
		} 
		System.out.println("������ �����մϴ�.....");
	}
}
