import java.io.*;
import java.net.*;
public class p0401_02 {

	public static void main(String[] args) {
		ServerSocket aSK;
		Socket aS;
		System.out.println("서버를 시작합니다.....");
		try {
			aSK = new ServerSocket(12000);
			
			System.out.println("클라이언트 접속을 대기하고 있습니다......");
			aS = aSK.accept();
			System.out.println("클라이언트가 접속하였습니다.");
			
			System.out.print(aS.getLocalAddress());
			System.out.println(" : "+ aS.getPort());
			
			// 문자열 전송
			OutputStream OS = aS.getOutputStream();
			OS.write("Hello, World!".getBytes());
			
			aSK.close();
			aS.close();
		} catch (IOException e) {
			System.out.println("소켓 생성에 실패 하였습니다.");
			System.out.println("서버가 비정상적으로 종료되었습니다.");
			return;
		} 
		System.out.println("서버를 종료합니다.....");
	}
}
