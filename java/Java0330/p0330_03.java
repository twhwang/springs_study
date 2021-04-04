// Stack & Queue
import java.util.*;

public class p0330_03 {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		
		st.push("0"); // stack�� ��ä�� ����
		st.push("1");
		st.push("2");
		
		q.offer("0"); // queue�� ��ü�� ����, ����(true) �Ǵ� ����(false)
		q.offer("1");
		q.offer("2");
		
		System.out.println("[Stack]");
		while(!st.empty()) {
			System.out.println(st.pop()); // Stack ���� ������ ��ü�� ����, ������� �� EmptyException �߻�
		}
		System.out.println("[Queue]");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // Queue�� ��ä�� ����, ������� �� null�� ��ȯ
		}
		
	}
}
