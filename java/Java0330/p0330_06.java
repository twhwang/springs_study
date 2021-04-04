// 람다식
interface Spring{
	int add(int iNum1, int iNum2);
}

public class p0330_06 {

	public static void main(String[] args) {
		Spring aSpring = (int iNum1, int iNum2) -> {return iNum1 + iNum2;};
		int Num = aSpring.add(566, 400);
		System.out.println(Num);
	}
	
	// 기존 방식
	/*
	static int add(int iNum1, int iNum2) {
		return iNum1 + iNum2;
	}
	public static void main1(String[] args) {
		int Num1 = add(100, 200);
		System.out.println(Num1);
	}
	*/
}
