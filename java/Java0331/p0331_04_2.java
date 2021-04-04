import java.util.*;
class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name + ":" + age;
	}
	
}
public class p0331_04_2 {
	public static void main(String[] args) {
		
		Object[] objarr = {"1",new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		Set oSet = new HashSet();
		
		for(int i = 0 ; i < objarr.length ; i++) {
			oSet.add(objarr[i]);
		}
		System.out.println(oSet);
		
		Iterator it = oSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-----");
		
		Set set = new HashSet();
		
		for(int i = 0 ; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("-----");
		
		HashSet pSet = new HashSet();
		pSet.add("abc");
		pSet.add("abc");
		pSet.add(new Person("David",10));
		pSet.add(new Person("David",10));
		
		System.out.println(pSet);
		
	}
}
