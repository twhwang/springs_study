// copyOf()
import java.util.*;
public class p0330_05_2 {
	public static void main(String[] args) {
		int [] arr = new int[] {0, 1, 2, 3, 4, 5};
		int [] arr2 = Arrays.copyOf(arr, 2);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i : arr2) {
			System.out.println(i);
		}
		
	}
}
