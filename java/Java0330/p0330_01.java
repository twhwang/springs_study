// 제너릭
public class p0330_01 {
	public static void main(String[] args) {
		String iTemp = DataToString(1024);
		System.out.println(iTemp);
		
		String sTemp = DataToString("간결");
		System.out.println(sTemp);
		
		String dTemp = DataToString(3.14);
		System.out.println(dTemp);
	}
	// 메소드 오버로딩 기법
	static int add(int iNum1, int iNum2) {
		return iNum1 + iNum2;
	}
	static String DataToString(int iNum) {
		return "[" + iNum + "]";
	}
	// 제너릭 기법 (메서드에 적용)
	static <T> String DataToString (T iNum) {
		return "[" + iNum + "]";
	}
}
