// concat, StringBuffer
public class p0329_08 {

	public static void main(String[] args) {
		String s = "�ȳ�";
		String s2 = s.concat("�ϼ���");
		
		System.out.println(s);
		System.out.println(s2);
		
		StringBuffer sb = new StringBuffer("����");
		StringBuffer sb2 = sb;
		sb2.append("����?");
		
		System.out.println(sb);
		System.out.println(sb2);
		
		StringBuilder sbb = new StringBuilder("����");
		StringBuilder sbb2 = sbb;
		sbb2.append("����?");
		
		System.out.println(sbb);
		System.out.println(sbb2);
		

	}

}
