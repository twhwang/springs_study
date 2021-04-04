// equals()의 오버라이딩
class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id==((Person)obj).id;
		}
		else {
			return false;
		}
	}
	Person(long id){
		this.id = id;
	}
}
public class p0329_04 {
	public static void main(String[] args) {
		Person nP1 = new Person(818181);
		Person nP2 = new Person(818181);
		
		if(nP1.equals(nP2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}
