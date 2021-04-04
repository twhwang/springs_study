class SpringA{
	// Object ÀÚµ¿ »ó¼ÓµÊ
}
class SpringB extends SpringA{
	
}
public class p0326_02_2 {
	public static void main(String[] args) {
		SpringA aSp = new SpringA();
		SpringB aSb = new SpringB();
		aSb.toString();
		System.out.println(aSp);
	}
}
