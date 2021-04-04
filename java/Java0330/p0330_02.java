// 컬렉션 (이미 짜놓은 클래스의 모음)
import java.util.ArrayList;
import java.util.Collections;

public class p0330_02 {
	public static void main(String[] args) {
		// 컬렉션의 자료형은 기본적으로 제너릭형 혹은 Object형이다.
		ArrayList list1 = new ArrayList(10);
		list1.add(100); // int(기본형) -> Integer(객체)로 Boxing
		list1.add(3.14); // double(기본형) -> Double(객체)로 Boxing
		list1.add("안녕");
		list1.add(new String("잘가렴"));
		
		for (int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));
		}
		
		list1.clear(); //*항목을 모두 제거한다.
		System.out.println(list1.size()); // 콜렉션 안의 객체의 갯수를 반환
		
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		System.out.println(list1.hashCode()); // 콜렉션의 hashCode 확인
		System.out.println(list1.isEmpty()); // 콜렉션이 비어있는지 아닌지 확인
		System.out.println("list1 : " + list1);
		System.out.println(list1.iterator()); // iterator를 반환
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1에서 2번째(1)에서 4번째(5)전까지 출력
		System.out.println("list2 : " + list2);
		System.out.println(list1.equals(list2)); // 같은 콜렉션인지 확인
		
		Collections.sort(list1); // Collections는 클래스이다.
		Collections.sort(list2);
		System.out.println(list1);
		System.out.println(list2);
		
		// containsAll : 지정된 객체들이 컬렉션에 포함되어 있는지 확인
		// remainAll : 포함된 객체만 남기고 나머지 삭제
		
	}
}
