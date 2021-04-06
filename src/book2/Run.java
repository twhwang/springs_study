package book2;

public class Run {
	public static void main(String[] args) {
		
		BookManager aBookManager = new BookManager();
		aBookManager.Start();
		
	}
	
	public static void main_equals_test (String[] args) {

		Book aBook = new Book("123", "1", "2");
		System.out.println(aBook.equals("123"));
		System.out.println(aBook.equals(new String ("123")));
	}
	
}
