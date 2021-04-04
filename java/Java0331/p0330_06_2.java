class CardA{
	enum Kind{
		CLOVER, DIAMOND, HEART, SPADE
	}
	enum Value{
		TWO, THREE, FOUR
	}
	
	final int kind  = Kind.CLOVER;
	final int value = Value.TWO;
	
}
public class p0330_06_2 {
	public static void main(String[] args) {
		System.out.println("참 거짓 여부 : " + (CardA.Kind.CLOVER == CardA.Kind.DIAMOND));
	}
}
