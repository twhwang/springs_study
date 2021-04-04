import java.io.IOException;
import java.net.*;
public class p0401_01 {

	public static void main(String[] args) {
		ServerSocket aSK;
		System.out.println("서버를 시작합니다.....");
		try {
			aSK = new ServerSocket(12141); // 1024 < 포트번호 < 65536
			System.out.println("클라이언트 접속을 대기하고 있습니다......");
			Socket aSocket = aSK.accept(); // 연결 수락 (수락 전까지 프로그래밍 대기함)
			System.out.println("클라이언트가 접속하였습니다.");
			
			System.out.print(aSocket.getLocalAddress());
			System.out.println(" : "+ aSocket.getPort());
			
			aSK.close();
			aSocket.close();
		} catch (IOException e) {
			System.out.println("소켓 생성에 실패 하였습니다.");
		} 
		System.out.println("서버를 종료합니다.....");
	}
}
