// 제너릭
public class p0330_01_2 {
	// 제너릭 기법 (메서드에 적용)
	static <T1, T2> String DataToString2 (T1 iNum1, T2 iNum2) {
		return "[" + iNum1 + "," + iNum2 + "]";
	}
	public static void main(String[] args) {
		String Temp1 = DataToString2(3, 3.14);
		System.out.println(Temp1);
		
		String Temp2 = DataToString2("안녕", 50);
		System.out.println(Temp2);
	}
}
