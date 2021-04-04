// Comparator, Comparable
import java.util.*;
class Desc implements Comparator{

	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; // -1을 곱하여 기본 정렬방식의 역으로 변경한다.
			// 또는 c2.compareTo(c1)와 같이 순서를 바꾸어도 된다.
		}
		return -1;
	}
}

public class p0331_01_2 {
	
	static String[] strArr = {"고양이","개","오리","닭"};
	
	public static void main(String[] args) {
		
		Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 문자열을 대소문자 구분없이 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
		//CASE_SENSITIVE_ORDER : 대소문자 구분하여 정렬
		
		Arrays.sort(strArr, new Desc()); // 역순 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
		
	}
}
