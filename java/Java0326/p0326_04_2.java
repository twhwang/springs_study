
public class p0326_04_2 {
	public static void main(String[] args) {
		String brand = "브랜드";
		String model = "모델명";
		int    price = 10000; 
		
		String aString;
		
		aString = String.format("[%s / %s / %d]",brand, model, price);
		
		System.out.println(aString);
		
	}

}
