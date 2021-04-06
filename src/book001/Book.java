package book001;

public class Book {
	private String bName;    // 책제목
	private String author;     // 저자
	private String publ;        // 출판사
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof String) { // obj가 책 이름과 같은 타입인지 체크
			if(bName.equals((String)obj)) { // 책 이름과 obj(검색된 책 이름)를 비교
				return true; // 동일한 경우 참을 리턴
			}
		}
		return false; // 동일하지 않을 경우 거짓을 리턴
	}

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
