//TreeSet - headSet, tailSet
import java.util.*;
public class p0330_05_2 {

	public static void main(String[] args) {
		TreeSet<Integer> TS = new TreeSet<Integer>();
		
		TS.add(80);
		TS.add(95);
		TS.add(50);
		TS.add(35);
		TS.add(45);
		TS.add(65);
		TS.add(10);
		TS.add(100);
		
		System.out.println("50보다 작은 값 : " + TS.headSet(50));
		System.out.println("50보다 큰 값 : " + TS.tailSet(50));
		
		
		//// 전체 출력 방법 ////
		System.out.println("1.직접 출력");
		System.out.println(TS);
		
		System.out.println("2. for each문 사용");
		for(Integer iTemp : TS) {
			System.out.print(iTemp + " ");
		}
		System.out.println();
		System.out.println("3. Iterator 사용");
		Iterator<Integer> itTS = TS.iterator();
		while(itTS.hasNext()) { // boolean hasNext() : 읽어올 요소가 있는지 확인
			System.out.print(itTS.next() + " "); // Object next() : 다음 요소를 읽어옴
		}
	}
}
