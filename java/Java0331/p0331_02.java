import java.util.*;
/*
 Vector의 단점 (ArrayList와 비교)
 벡터는 항상 동기화되는 장점이나 단점을 가지고 있다.
 스레드가 1개일 경우에도 동기화를 하기 때문에 ArrayList보다 성능이 떨어진다.
 ArrayList와 기본적인 기능은 동일하나
 자동 동기화 기능이 빠져있고, 동기화 옵션이 별개로 존재한다.
 그리고 벡터에 비해 속도가 빠르기에 ArrayList가 상대적으로 많이 쓰이고 있다.
 */
public class p0331_02 {
	
	public static void main(String[] args) {
		Vector<Integer> aVector = new Vector<Integer>();
		
		aVector.add(5);
		aVector.add(-200);
		aVector.add(35);
		aVector.add(9999);
		aVector.add(200);
		aVector.add(10);
		
		for (Object Temp : aVector) {
			System.out.print(Temp + ",");
		}
		System.out.println();
		
		aVector.add(3, 888);
		for (Object Temp : aVector) {
			System.out.print(Temp + ",");
		}
		System.out.println();
		
		aVector.remove(2);
		for (Object Temp : aVector) {
			System.out.print(Temp + ",");
		}
		System.out.println();
		
		aVector.removeAllElements();
		for (Object Temp : aVector) {
			System.out.print(Temp + ",");
		}
		System.out.println("__________");
	}
	
	public static void main1(String[] args) {
		Vector aVector = new Vector();
		
		aVector.add(5);
		aVector.add(-200);
		aVector.add(3.5);
		aVector.add(9999);
		aVector.add("안녕");
		
		for (Object Temp : aVector) {
			System.out.println(Temp);
		}
		
		System.out.println(aVector.size()); // 크기
		System.out.println(aVector.capacity()); // 용량
		
	}
}
