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
		
		Iterator it = list.iterator(); //����� ��ü�� �����ϴ� ���� ���
		
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		while(it.hasNext()) { // it(��ü)�� ���� ������ �ִ��� üũ 'hasNext'
			System.out.println(it.next()); //for��ó�� i��� ������ ������ �ʵ��� ��� ����
		}		
	}
}
