// 열거형 : 여러 상수를 선언할 때 편리하게 선언할 수 있는 방법
public class p0330_06 {
	enum SpringA{
		CLOVER,
		HEART,
		DIAMOND,
		서울,
		부산
	}
	public static void main(String[] args) {
		System.out.println(SpringA.CLOVER);
		System.out.println(SpringA.HEART);
		System.out.println(SpringA.DIAMOND);
		System.out.println(SpringA.서울);
		System.out.println(SpringA.부산);
		
		System.out.println(SpringA.CLOVER.ordinal());
		System.out.println(SpringA.HEART.ordinal());
		System.out.println(SpringA.DIAMOND.ordinal());
		System.out.println(SpringA.서울.ordinal());
		System.out.println(SpringA.부산.ordinal());
		
		 SpringA[] aSpringA = SpringA.values();
		    for(SpringA Temp : aSpringA) {
		      System.out.print("[" + Temp + ":" + Temp.ordinal() + "]");
		    }
		
		    
		    
	}
}
