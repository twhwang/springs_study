// HashMap
import java.util.*;
/*
 * 2개의 값으로 이루어짐 (키, data) 
 * 장점 : 추가, 삭제가 빠르다. 검색은 더욱 빠르다.
 * 단점 : 키는 중복될 수 없다. (중복 삽입 시 이전 값 삭제)
 */

public class p0331_03 {
	public static void main(String[] args) {
		HashMap<String, String> aHM = new HashMap<String, String>();
		aHM.put("사과", "SAGWA");
		aHM.put("사랑", "SARANG");
		aHM.put("아기", "AGI");
		aHM.put("가족", "GAJOK");

		System.out.println(aHM.get("사과"));
		System.out.println(aHM.get("사랑"));
		System.out.println(aHM.get("아기"));
		System.out.println(aHM.get("가족"));
		
		System.out.println("__________");
		
		HashMap<String, Integer> aHM2 = new HashMap<String, Integer>();
		aHM2.put("서울", 02);
		aHM2.put("부산", 051);
		aHM2.put("대전", 041);
		aHM2.put("광주", 061);
		aHM2.put("대구", 053);
		
		System.out.println(aHM2.get("서울"));
		System.out.println(aHM2.get("대전"));
		System.out.println(aHM2.get("대구"));
		System.out.println(aHM2.get("부산"));
		System.out.println(aHM2.get("광주"));
	}
}
