// 제너릭
public class p0330_01_4 {
	public static void main(String[] args) {
		// 정석적인 방법
		Data2<Integer, Double> aD1 = new Data2<Integer, Double>(3, 3.14);
		System.out.println(aD1.gettNum1());
		System.out.println(aD1.gettNum2());
		// 뒤쪽 객체 안의 타입 생략 가능
		Data2<Integer, Double> aD2 = new Data2<>(4, 4.14);
		System.out.println(aD2.gettNum1());
		System.out.println(aD2.gettNum2());
		// 참조변수 시에는 <>를 생략해야 가능
		Data2 aD3 = new Data2<>(7, 7.14);
		System.out.println(aD3.gettNum1());
		System.out.println(aD3.gettNum2());
		// 양 쪽 <>를 생략하고 가능
		Data2 aD4 = new Data2(8, 8.14);
		System.out.println(aD4.gettNum1());
		System.out.println(aD4.gettNum2());
		// 유형대신 Object 명시로도 가능
		Data2<Object, Object> aD5 = new Data2(9, 9.14);
		System.out.println(aD5.gettNum1());
		System.out.println(aD5.gettNum2());
	}
}

class Data2 <T1, T2>{
	private T1 tNum1;
	private T2 tNum2;
	public T1 gettNum1() {
		return tNum1;
	}
	public void settNum1(T1 tNum1) {
		this.tNum1 = tNum1;
	}
	public T2 gettNum2() {
		return tNum2;
	}
	public void settNum2(T2 tNum2) {
		this.tNum2 = tNum2;
	}
	
	Data2(T1 tNum1, T2 tNum2){
		this.tNum1 = tNum1;
		this.tNum2 = tNum2;
	}
	
}