package book001;

public class Book {
	private String bName;    // å����
	private String author;     // ����
	private String publ;        // ���ǻ�
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof String) { // obj�� å �̸��� ���� Ÿ������ üũ
			if(bName.equals((String)obj)) { // å �̸��� obj(�˻��� å �̸�)�� ��
				return true; // ������ ��� ���� ����
			}
		}
		return false; // �������� ���� ��� ������ ����
	}

	public Book (String bName, String author, String publ){
		this.bName = bName;
		this.author = author;
		this.publ = publ;
	}

	@Override
	public String toString() {
		return "�̸� : " + bName + "\n���� : " + author + "\n���� : " + publ;
	}
	
}
