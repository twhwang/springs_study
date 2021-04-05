// UDP 소켓프로그래밍 - 클라이언트
import java.net.*;
import java.io.*;
public class p0405_02 {
	public void start() throws IOException, UnknownHostException {
		DatagramSocket DS = new DatagramSocket();
		InetAddress IA = InetAddress.getByName("118.38.169.33");
		
		byte [] msg = new byte[100];
		
		DatagramPacket outP = new DatagramPacket(msg, 1, IA, 7777);
		DatagramPacket inP = new DatagramPacket(msg, msg.length);
		
		DS.send(outP);
		DS.receive(inP);
		
		System.out.println("current server time : " + new String(inP.getData()));
		
		DS.close();
	}
	public static void main(String[] args) {
		try {
			new p0405_02().start();
		} catch (Exception e ) {e.printStackTrace(); }

	}

}
