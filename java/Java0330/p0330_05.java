// for each�� : ��ü�� �ַ� �ٷ� �� ���
import java.util.*;
public class p0330_05 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(0);
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		for (Object i : list) {
			System.out.println(i);
		}
	}
	
	public static void main3(String[] args) {
		ArrayList<Integer> list = new ArrayList(0);
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		for (int i : list) {
			System.out.println(i);
		}
	}
	
	public static void main2(String[] args) { // for each�� : �ϳ��� ���� �����Ͽ� �����
		int [] iArray = new int [] {10, 3, 5, 7, 9};
		for (int i : iArray) { // ������ : �迭�̸�
			System.out.println(i);
		}
	}
	
	public static void main1(String[] args) {
		int [] iArray = new int [] {10, 3, 5, 7, 9};
		for (int i = 0 ; i < iArray.length ; i++) {
			System.out.println(iArray[i]);
		}
	}
}
