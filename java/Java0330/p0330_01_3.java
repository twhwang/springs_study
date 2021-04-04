// 제너릭 (클래스에 적용)
public class p0330_01_3 {
	public static void main(String[] args) {
		DataInt aDI = new DataInt();
		aDI.setiNum(1004);
		System.out.println(aDI.getiNum());
		
		DataDouble aDI2 = new DataDouble();
		aDI2.setdNum(3.14);
		System.out.println(aDI2.getdNum());
		
		DataString aDI3 = new DataString();
		aDI3.setsNum("Hello");
		System.out.println(aDI3.getsNum());
		
		Data<Integer> aT1 = new Data<Integer>();
		aT1.setNum(130103145);
		System.out.println(aT1.getNum());
		
		Data<Double> aT2 = new Data<Double>();
		aT2.setNum(13.0103145);
		System.out.println(aT2.getNum());
		
		
	}
}
class Data <T>{
	private T Num;

	public T getNum() {
		return Num;
	}

	public void setNum(T num) {
		Num = num;
	}
}


class DataInt{
	private int iNum;

	public int getiNum() {
		return iNum;
	}

	public void setiNum(int iNum) {
		this.iNum = iNum;
	}
}
class DataDouble{
	private double dNum;

	public double getdNum() {
		return dNum;
	}

	public void setdNum(double dNum) {
		this.dNum = dNum;
	}
}
class DataString{
	private String sNum;

	public String getsNum() {
		return sNum;
	}

	public void setsNum(String sNum) {
		this.sNum = sNum;
	}
}
