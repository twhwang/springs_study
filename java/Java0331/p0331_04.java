import java.util.*;
public class p0331_04 {
	public static void main(String[] args) {
		HashSet<Integer> aHS = new HashSet<Integer>();
		System.out.println(aHS.size());
		System.out.println(aHS.add(0));
		System.out.println(aHS.add(1));
		System.out.println(aHS.add(2));
		System.out.println(aHS.size());
		System.out.println(aHS.add(2)); // �ߺ��� ���� ������ false�� ��ȯ
		
		for (Integer Temp : aHS) {
			System.out.print(Temp + " ");
		}
		
		
	}

}
