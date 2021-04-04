// Comparator, Comparable
import java.util.*;
class sort_t implements Comparator{
	public int compare(Object o1, Object o2) {
		if (o1 instanceof bookInfo && o2 instanceof bookInfo) {
			bookInfo bInfo1 = (bookInfo)o1;
			bookInfo bInfo2 = (bookInfo)o2;
			int iTemp = bInfo1.getName().charAt(0) - bInfo2.getName().charAt(0);
			return iTemp;
		}
		return 0;
	}
}

class bookInfo {
	private String name;
	private String author;
	private String publ;
	
	bookInfo (String name, String author, String publ){
		this.name = name;
		this.author = author;
		this.publ = publ;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class p0331_01 {
	
	public static void main(String[] args) {
		bookInfo[] abInfo = new bookInfo[] {
				new bookInfo("ȣ�й��� �ļ���","ȫ�浿1","���ǻ�1"),
				new bookInfo("ȣ�ڹ��� �ļ���","ȫ�浿2","���ǻ�2"),
				new bookInfo("�й��� �ļ���","ȫ�浿3","���ǻ�3"),
		};
		for(bookInfo Temp : abInfo) {
			System.out.println(Temp.getName());
			}
		Arrays.sort(abInfo, new sort_t());
		for(bookInfo Temp : abInfo) {
			System.out.println(Temp.getName());
			}
	}
	
	
	public static void main1(String[] args) {
		String aStr = "A";
		String bStr = "A";
		
		String cStr = "a";
		String dStr = "A";
		
		String eStr = "A";
		String fStr = "a";
		
		int iResult1 = aStr.compareTo(bStr);
		System.out.println(iResult1);
		
		int iResult2 = cStr.compareTo(dStr);
		System.out.println(iResult2);
		
		int iResult3 = eStr.compareTo(fStr);
		System.out.println(iResult3);
	}
}
