import java.io.*;
import java.net.*;
public class p0401_02 {

	public static void main(String[] args) {
		ServerSocket aSK;
		Socket aS;
		System.out.println("������ �����մϴ�.....");
		try {
			aSK = new ServerSocket(12000);
			
			System.out.println("Ŭ���̾�Ʈ ������ ����ϰ� �ֽ��ϴ�......");
			aS = aSK.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			
			System.out.print(aS.getLocalAddress());
			System.out.println(" : "+ aS.getPort());
			
			// ���ڿ� ����
			OutputStream OS = aS.getOutputStream();
			OS.write("Hello, World!".getBytes());
			
			aSK.close();
			aS.close();
		} catch (IOException e) {
			System.out.println("���� ������ ���� �Ͽ����ϴ�.");
			System.out.println("������ ������������ ����Ǿ����ϴ�.");
			return;
		} 
		System.out.println("������ �����մϴ�.....");
	}
}
