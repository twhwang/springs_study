import java.util.*;
public class p0330_07 {
	
	public static void main(String[] args) {
		Integer [] arr = {3, 2, 0, 1, 4};
		List<Integer> aList = Arrays.asList(arr);
		// �⺻�� �迭�� ��ü�� �迭�� ��ȯ�� �� ����.(JAVA������)
		for (int iTemp : arr) {
			System.out.println(iTemp);
		}
		
		for (int iList : aList) {
			System.out.println(iList);
		}
	}
	
	public static void main1(String[] args) {
		int [] arr = {3, 2, 0, 1, 4};  			// ������ �ȵ� ������
		int idx = Arrays.binarySearch(arr, 2);  // 2�� ��ġ �˻�
		System.out.println(idx);
		
		Arrays.sort(arr);						// ���ĵ� ������
		idx = Arrays.binarySearch(arr, 2); 		 // 2�� ��ġ �˻�
		System.out.println(idx);
	}
}
