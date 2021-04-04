abstract class Mobile{
	private String brand = "";
	private String model = "";
	private int    price = 0; 
	
	Mobile (String brand, String model, int price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	abstract void Special();
	
	public String toString() {
		return String.format("[%s,%s,%d]",brand, model, price);
	}
}
class GetReverseTime extends Mobile {

	GetReverseTime (String brand, String model, int price) {
		super("ªÔº∫", "∞∂∑∞Ω√", 10500);
	}

	void Special() {
		System.out.println("≥≠ ªÔº∫∆‰¿Ã∞° ¿÷¿Ω");	
	}
	
}

public class p0326_04 {
	public static void main(String[] args) {
		GetReverseTime GRT = new GetReverseTime(null, null, 0);
		System.out.println(GRT);
		GRT.Special();
	}
}
