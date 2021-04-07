package book003;

import java.text.SimpleDateFormat;
import java.util.*;

public class BookManager {
	// private Book [] aBook;
	private ArrayList<Book> aBook;
	
	public BookManager(){
	//	aBook = new Book [] {
	//				 new Book ("고양이의 왕", "닉 샤랫", "키다리"),
	//				 new Book ("범인없는 살인의 밤", "히가시노 케이고", "알에이치코리아"), 
	//				 new Book ("가벼운 책임", "김신희", "오티움")
	//				}
		aBook = new ArrayList<Book> ();
			aBook.add(new Book ("고양이의 왕", "닉 샤랫", "키다리"));
			aBook.add(new Book ("범인없는 살인의 밤", "히가시노 케이고", "알에이치코리아"));
			aBook.add(new Book ("가벼운 책임", "김신희", "오티움"));
			aBook.add(new Book ("싱크 어게인","애덤 그랜트","한경비피"));
	}
	
	public void Start() {
		Scanner aScanner = new Scanner(System.in);
		while (true) {
			Menu();
			String Command = aScanner.nextLine();
			if (0 == Command.length()) {
				continue;
			}
			switch(Command.charAt(0)) {
				case '1' : // 1번
					Print();
					continue;
				case '2' : // 2번
					insertBook();
					continue;
				case '3' : // 3번
					if (aBook.size()  == 0) {
						System.out.println("\n[System] 더 이상 삭제할 도서가 없습니다.");
					} else {
						removeBook(SearchBook());
					}
					continue;
				case '4' : // 4번
					//int i = searchBook();
					Book Temp = SearchBook();
					//if(-1 != i) {
					if(null != Temp) {
						System.out.println(Temp);
					} 
					continue;
				case 'X' : // 종료
					System.out.println("[System]" + getTime() + "도서 관리 시스템을 종료합니다...");
					break;
				default :
					continue;
			}
			break;
		}
		aScanner.close();
	}
	
	private static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("【hh:mm:ss】");
		return f.format(new Date());
	}
	
	private void Menu() {
		HeadLine();
		System.out.println("**********************************");
		System.out.println("******* 1. 책 목록 출력    *******");
		System.out.println("******* 2. 책 추가         *******");
		System.out.println("******* 3. 책 삭제         *******");
		System.out.println("******* 4. 책 검색         *******");
		System.out.println("******* X. 프로그램 종료   *******");
		System.out.println("**********************************");
		System.out.println("**********************************");
		System.out.print("선택>");
	}
	
	private void HeadLine() {
		System.out.println("**********************************");
		System.out.println("***** Book Management System *****");
	} // 제목 출력
	
	private void Print() {
		//for (int i = 0 ; i < aBook.length ; i++) {
		//	System.out.println(aBook[i] + "\n**------------------**");
		//}
		for(Book iBook : aBook) {
			System.out.println(iBook +  "\n**------------------**");
		}
		System.out.println("Total Book Count : " + aBook.size());
	} // 1번 출력
	
	
	private Book bookInput() {
		String bName;    // 책제목
		String author;     // 저자
		String publ;        // 출판사
		Scanner aScanner = new Scanner(System.in);
		while (true) {
			System.out.print("책 이름 : ");
			bName = aScanner.nextLine();
			if(0 == bName.length()) {
				System.out.println("[System] 올바른 도서 명을 입력하세요.");
				continue;
			}
			break;
		}
		System.out.print("책 저자 : ");
		author = aScanner.nextLine();
		if(0 == author.length()) {
			author = "미상";
		}
		System.out.print("출판사 : ");
		publ = aScanner.nextLine();
		if(0 == publ.length()) {
			publ = "알 수 없음";
		}
		System.out.printf("[System]" + getTime() +  "책 이름 : '%s', 책 저자 : %s', 출판사 : '%s'",bName,author,publ);
		return new Book (bName,author,publ);
	}
	private void insertBook() {
		/*
		Book bTemp = bookInput();
		Book [] newBook = new Book[aBook.length + 1];
		for (int i = 0 ; i < aBook.length ; i++) {
			newBook[i] = aBook[i];
		}
		newBook[aBook.length] = bTemp;
		aBook = newBook;
		*/
		aBook.add(bookInput());
		System.out.println(" 이(가) 등록되었습니다.");
	} // 2번 추가
	private void removeBook(Book Target) {
		// 인자/인수/매개변수 검사 (유효성 검사)
		if(null == Target) {
			return;
		}
		aBook.remove(Target);
	}
	/*
	private void removeBook(int iIndex) {
		// 인자/인수/매개변수 검사 (유효성 검사)
		if(0 > iIndex) {                                                                // 음수를 호출한 경우
			return;
		} else if (aBook.length - 1 < iIndex) {                             // 인덱스가 범위를 넘어선 경우
			return;
		} else if (aBook.length == 0) {                                       // 데이터가 없는 경우
			return;
		}
		
		Book [] delTemp = new Book [aBook.length - 1];
		
		for (int i = 0 ; i < delTemp.length ; i++) {
			if(i < iIndex) {
				delTemp[i] = aBook[i];
			} else {
				delTemp[i] = aBook[i+1];
			}
		}
		aBook = delTemp;
	} // 3번 삭제
	*/
	
	//private int searchBook() {
	private Book SearchBook() {
		String bName;    // 책제목
		Scanner aScanner = new Scanner(System.in);
		while (true) {
			System.out.print("책 이름 : ");
			bName = aScanner.nextLine();
			if(0 == bName.length()) {
				System.out.println("[System] 올바른 도서 명을 입력하세요.");
				continue;
			}
			break;
		}
		/*
		for(int i = 0 ; i < aBook.length ; i++) {
			if(aBook[i].equals(bName)) {
				return i;
			}
		}
		*/
		for(Book bTemp : aBook) {
			if(bTemp.getbName().equals(bName)) {
				return bTemp;
			}
		}
		System.out.printf("[System] '%s'을(를) 찾을 수 없습니다.\n",bName);
		return null; // 검색 실패 시
		//return -1;
	} // 4번 검색
}
