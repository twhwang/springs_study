// ������ : ���� ����� ������ �� ���ϰ� ������ �� �ִ� ���
public class p0330_06 {
	enum SpringA{
		CLOVER,
		HEART,
		DIAMOND,
		����,
		�λ�
	}
	public static void main(String[] args) {
		System.out.println(SpringA.CLOVER);
		System.out.println(SpringA.HEART);
		System.out.println(SpringA.DIAMOND);
		System.out.println(SpringA.����);
		System.out.println(SpringA.�λ�);
		
		System.out.println(SpringA.CLOVER.ordinal());
		System.out.println(SpringA.HEART.ordinal());
		System.out.println(SpringA.DIAMOND.ordinal());
		System.out.println(SpringA.����.ordinal());
		System.out.println(SpringA.�λ�.ordinal());
		
		 SpringA[] aSpringA = SpringA.values();
		    for(SpringA Temp : aSpringA) {
		      System.out.print("[" + Temp + ":" + Temp.ordinal() + "]");
		    }
		
		    
		    
	}
}
