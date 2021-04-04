//�Ű������� ������ - 253p ����
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
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����Ͽ����ϴ�.");
	}
}

public class p0326_02 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv1 aTv = new Tv1();
		Computer aCom = new Computer();
		
		
		b.buy(aTv);
		b.buy(aCom);
		
		System.out.println("���� ���� ����" + b.money + "���� �Դϴ�.");
		System.out.println("���� ���ʽ� ����Ʈ��" + b.bonusPoint + "�� �Դϴ�.");
	}
}
