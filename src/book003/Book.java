package book003;

public class Book {
	private String bName;    // å����
	private String author;     // ����
	private String publ;        // ���ǻ�
	
	/*
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof String) { // obj�� å �̸��� ���� Ÿ������ üũ
			if(bName.equals((String)obj)) { // å �̸��� obj(�˻��� å �̸�)�� ��
				return true; // ������ ��� ���� ����
			}
		}
		return false; // �������� ���� ��� ������ ����
	}
	*/

	public Book (String bName, String author, String publ){
		this.bName = bName;
		this.author = author;
		this.publ = publ;
	}

	@Override
	public String toString() {
		return "�̸� : " + bName + "\n���� : " + author + "\n���� : " + publ;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubl() {
		return publ;
	}

	public void setPubl(String publ) {
		this.publ = publ;
	}

}
