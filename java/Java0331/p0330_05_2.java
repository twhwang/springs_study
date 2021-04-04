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
		
		System.out.println("50���� ���� �� : " + TS.headSet(50));
		System.out.println("50���� ū �� : " + TS.tailSet(50));
		
		
		//// ��ü ��� ��� ////
		System.out.println("1.���� ���");
		System.out.println(TS);
		
		System.out.println("2. for each�� ���");
		for(Integer iTemp : TS) {
			System.out.print(iTemp + " ");
		}
		System.out.println();
		System.out.println("3. Iterator ���");
		Iterator<Integer> itTS = TS.iterator();
		while(itTS.hasNext()) { // boolean hasNext() : �о�� ��Ұ� �ִ��� Ȯ��
			System.out.print(itTS.next() + " "); // Object next() : ���� ��Ҹ� �о��
		}
	}
}
