//TreeSet
import java.util.*;
public class p0330_05 {

	public static void main(String[] args) {
		TreeSet TS = new TreeSet();
		
		for(int i = 0 ; TS.size() < 6 ; i++) {
			int num = (int)(Math.random() * 45 +1);
			TS.add(num);
		}
		
		System.out.println(TS);
		// TreeSet은 저장할 때 이미 정렬을 하기 때문에 따로 정렬할 필요가 없다.
	}

}
