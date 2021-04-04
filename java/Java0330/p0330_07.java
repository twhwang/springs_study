import java.util.*;
public class p0330_07 {
	
	public static void main(String[] args) {
		Integer [] arr = {3, 2, 0, 1, 4};
		List<Integer> aList = Arrays.asList(arr);
		// 기본형 배열을 객체형 배열로 변환할 수 없다.(JAVA적으로)
		for (int iTemp : arr) {
			System.out.println(iTemp);
		}
		
		for (int iList : aList) {
			System.out.println(iList);
		}
	}
	
	public static void main1(String[] args) {
		int [] arr = {3, 2, 0, 1, 4};  			// 정렬이 안된 데이터
		int idx = Arrays.binarySearch(arr, 2);  // 2의 위치 검색
		System.out.println(idx);
		
		Arrays.sort(arr);						// 정렬된 데이터
		idx = Arrays.binarySearch(arr, 2); 		 // 2의 위치 검색
		System.out.println(idx);
	}
}
