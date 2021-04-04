// Stack & Queue
import java.util.*;

public class p0330_03 {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		
		st.push("0"); // stack에 객채를 저장
		st.push("1");
		st.push("2");
		
		q.offer("0"); // queue에 객체를 저장, 성공(true) 또는 실패(false)
		q.offer("1");
		q.offer("2");
		
		System.out.println("[Stack]");
		while(!st.empty()) {
			System.out.println(st.pop()); // Stack 가장 위쪽의 객체를 꺼냄, 비어있을 시 EmptyException 발생
		}
		System.out.println("[Queue]");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // Queue의 객채를 꺼냄, 비어있을 시 null을 반환
		}
		
	}
}
