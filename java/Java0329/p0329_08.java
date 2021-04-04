// concat, StringBuffer
public class p0329_08 {

	public static void main(String[] args) {
		String s = "안녕";
		String s2 = s.concat("하세요");
		
		System.out.println(s);
		System.out.println(s2);
		
		StringBuffer sb = new StringBuffer("누구");
		StringBuffer sb2 = sb;
		sb2.append("세요?");
		
		System.out.println(sb);
		System.out.println(sb2);
		
		StringBuilder sbb = new StringBuilder("누구");
		StringBuilder sbb2 = sbb;
		sbb2.append("세요?");
		
		System.out.println(sbb);
		System.out.println(sbb2);
		

	}

}
