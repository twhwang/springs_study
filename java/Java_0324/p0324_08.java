class hCar extends Car {
	hCar(String name){
		super("�����ڵ���",name);
	}
}
class Car{
	String vender;
	String name;
	Car(String vender,String name){
		this.vender = vender;
		this.name = name;
	}
	void State() {
		System.out.printf("Car[%s, %s]", vender, name);
	}
}
public class p0324_08 {
	public static void main(String[] args) {
		hCar ahCar = new hCar("���̿���");
		ahCar.State();
	}
	public static void main1(String[] args) {
		Car aCar = new Car("�����ڵ���","�׷���");
		aCar.State();
	}
}
