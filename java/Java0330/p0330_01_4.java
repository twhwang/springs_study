// ���ʸ�
public class p0330_01_4 {
	public static void main(String[] args) {
		// �������� ���
		Data2<Integer, Double> aD1 = new Data2<Integer, Double>(3, 3.14);
		System.out.println(aD1.gettNum1());
		System.out.println(aD1.gettNum2());
		// ���� ��ü ���� Ÿ�� ���� ����
		Data2<Integer, Double> aD2 = new Data2<>(4, 4.14);
		System.out.println(aD2.gettNum1());
		System.out.println(aD2.gettNum2());
		// �������� �ÿ��� <>�� �����ؾ� ����
		Data2 aD3 = new Data2<>(7, 7.14);
		System.out.println(aD3.gettNum1());
		System.out.println(aD3.gettNum2());
		// �� �� <>�� �����ϰ� ����
		Data2 aD4 = new Data2(8, 8.14);
		System.out.println(aD4.gettNum1());
		System.out.println(aD4.gettNum2());
		// ������� Object ��÷ε� ����
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