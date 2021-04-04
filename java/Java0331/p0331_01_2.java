// Comparator, Comparable
import java.util.*;
class Desc implements Comparator{

	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; // -1�� ���Ͽ� �⺻ ���Ĺ���� ������ �����Ѵ�.
			// �Ǵ� c2.compareTo(c1)�� ���� ������ �ٲپ �ȴ�.
		}
		return -1;
	}
}

public class p0331_01_2 {
	
	static String[] strArr = {"�����","��","����","��"};
	
	public static void main(String[] args) {
		
		Arrays.sort(strArr); // String�� Comparable������ ���� ����
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // ���ڿ��� ��ҹ��� ���о��� ����
		System.out.println("strArr = " + Arrays.toString(strArr));
		//CASE_SENSITIVE_ORDER : ��ҹ��� �����Ͽ� ����
		
		Arrays.sort(strArr, new Desc()); // ���� ����
		System.out.println("strArr = " + Arrays.toString(strArr));
		
	}
}
