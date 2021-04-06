package book001;

public class Book {
	private String bName;    // 책제목
	private String author;     // 저자
	private String publ;        // 출판사
	
	public Book (String bName, String author, String publ){
		this.bName = bName;
		this.author = author;
		this.publ = publ;
	}

	@Override
	public String toString() {
		return "이름 : " + bName + "\n저자 : " + author + "\n출판 : " + publ;
	}
	
}
