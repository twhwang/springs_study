//매개변수의 다형성 - 253p 예제
class Product{
	int price;
	int bonusPoint;
	
	Product (int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product{
	Tv1(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하였습니다.");
	}
}

public class p0326_02 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv1 aTv = new Tv1();
		Computer aCom = new Computer();
		
		
		b.buy(aTv);
		b.buy(aCom);
		
		System.out.println("현재 남은 돈은" + b.money + "만원 입니다.");
		System.out.println("현재 보너스 포인트는" + b.bonusPoint + "점 입니다.");
	}
}
