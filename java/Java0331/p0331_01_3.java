import java.util.*;
class D implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer)) {
			return -1; // Integer�� �ƴϸ� ������ �ʰ� -1 ��ȯ
		}
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i1.compareTo(i2) * -1;
	}
	
}
public class p0331_01_3 {
	public static void main(String[] args) {
		Integer[] arr = {30, 40, 10, 20, 50};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new D());
		System.out.println(Arrays.toString(arr));

	}
}
