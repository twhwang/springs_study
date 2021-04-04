
public class p0402_07 {
	public static void main(String[] args) {
		Runnable r = new aRun();
		new Thread(r).start();
		new Thread(r).start();
	}
}
class Account{
	private int balance = 1000;
	public int getBalance() {
		return balance;
	}
	public void withdraw(int money) {
		try { Thread.sleep(1000); }
		catch(InterruptedException e) {}
		balance -= money;
	}
}
class aRun implements Runnable{
	Account acc = new Account();

	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}
}