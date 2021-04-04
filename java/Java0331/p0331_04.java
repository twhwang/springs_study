import java.util.*;
public class p0331_04 {
	public static void main(String[] args) {
		HashSet<Integer> aHS = new HashSet<Integer>();
		System.out.println(aHS.size());
		System.out.println(aHS.add(0));
		System.out.println(aHS.add(1));
		System.out.println(aHS.add(2));
		System.out.println(aHS.size());
		System.out.println(aHS.add(2)); // 중복된 값이 있으면 false를 반환
		
		for (Integer Temp : aHS) {
			System.out.print(Temp + " ");
		}
		
		
	}

}
