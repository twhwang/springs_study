// Iterator
import java.util.*;
public class p0330_04 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); //저장된 객체에 접근하는 데에 사용
		
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		while(it.hasNext()) { // it(객체)가 값을 가지고 있는지 체크 'hasNext'
			System.out.println(it.next()); //for문처럼 i라는 변수를 만들지 않도록 사용 가능
		}		
	}
}
