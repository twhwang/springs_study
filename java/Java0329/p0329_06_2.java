// Spring�� �����ڿ� �޼���
public class p0329_06_2 {
	public static void main(String[] args) {
		String ori = "�ȳ�,�ϼ��� ��,������ �����,��";
		String [] Temp;
		Temp = ori.split(",");
		
		String [] TT = new String[4];
		TT[0] = "0000";
		TT[1] = "1111";
		TT[2] = "2222";
		TT[3] = "3333";
		for(int i = 0 ; i < TT.length; i++) {
			System.out.println(TT[i]);
		}
	}
}
