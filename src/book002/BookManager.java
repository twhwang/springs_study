package book002;

import java.util.Scanner;

public class BookManager {
	private Book [] aBook;
	
	public BookManager(){
		aBook = new Book [] {
					 new Book ("고양이의 왕", "닉 샤랫", "키다리"),
					 new Book ("범인없는 살인의 밤", "히가시노 케이고", "알에이치코리아"), 
					 new Book ("가벼운 책임", "김신희", "오티움")
					};
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
					removeBook(0);
					continue;
				case '4' : // 4번
					int i = searchBook();
					if(-1 != i) {
						System.out.println(aBook[i]);
					} else {
						System.out.println("해당하는 책을 찾을 수 없습니다.");
					}
					continue;
				case 'X' : // 종료
					System.out.println("도서 관리 시스템을 종료합니다...");
					break;
				default :
					continue;
			}
			break;
		}
		aScanner.close();
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
		System.out.println("Total Book Count : " + aBook.length);
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
				System.out.println("올바른 책 이름을 입력하세요.");
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
		return new Book (bName,author,publ);
	}
	
	private void insertBook() {
		Book bTemp = bookInput();
		Book [] newBook = new Book[aBook.length + 1];
		for (int i = 0 ; i < aBook.length ; i++) {
			newBook[i] = aBook[i];
		}
		newBook[aBook.length] = bTemp;
		aBook = newBook;
	} // 2번 추가
		
	private void removeBook(int iIndex) {
		iIndex = 0; // 삭제 예정인 라인
		Book [] delTemp = new Book [aBook.length - 1];
		for (int i = 0 ; i < delTemp.length ; i++) {
			delTemp[i] = aBook[i+1];
		}
		aBook = delTemp;
		
	} // 3번 삭제
	
	private int searchBook() {
		String bName;    // 책제목
		Scanner aScanner = new Scanner(System.in);
		while (true) {
			System.out.print("책 이름 : ");
			bName = aScanner.nextLine();
			if(0 == bName.length()) {
				System.out.println("올바른 책 이름을 입력하세요.");
				continue;
			}
			break;
		}
		for(int i = 0 ; i < aBook.length ; i++) {
			if(aBook[i].equals(bName)) {
				return i;
			}
		}
		return -1; // 검색 실패 시
	} // 4번 검색
	
}
