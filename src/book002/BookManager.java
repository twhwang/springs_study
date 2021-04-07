package book002;

import java.util.Scanner;

public class BookManager {
	private Book [] aBook;
	
	public BookManager(){
		aBook = new Book [] {
					 new Book ("������� ��", "�� ����", "Ű�ٸ�"),
					 new Book ("���ξ��� ������ ��", "�����ó� ���̰�", "�˿���ġ�ڸ���"), 
					 new Book ("������ å��", "�����", "��Ƽ��")
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
				case '1' : // 1��
					Print();
					continue;
				case '2' : // 2��
					insertBook();
					continue;
				case '3' : // 3��
					removeBook(0);
					continue;
				case '4' : // 4��
					int i = searchBook();
					if(-1 != i) {
						System.out.println(aBook[i]);
					} else {
						System.out.println("�ش��ϴ� å�� ã�� �� �����ϴ�.");
					}
					continue;
				case 'X' : // ����
					System.out.println("���� ���� �ý����� �����մϴ�...");
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
		System.out.println("******* 1. å ��� ���    *******");
		System.out.println("******* 2. å �߰�         *******");
		System.out.println("******* 3. å ����         *******");
		System.out.println("******* 4. å �˻�         *******");
		System.out.println("******* X. ���α׷� ����   *******");
		System.out.println("**********************************");
		System.out.println("**********************************");
		System.out.print("����>");
	}
	
	private void HeadLine() {
		System.out.println("**********************************");
		System.out.println("***** Book Management System *****");
	} // ���� ���
	
	private void Print() {
		//for (int i = 0 ; i < aBook.length ; i++) {
		//	System.out.println(aBook[i] + "\n**------------------**");
		//}
		for(Book iBook : aBook) {
			System.out.println(iBook +  "\n**------------------**");
		}
		System.out.println("Total Book Count : " + aBook.length);
	} // 1�� ���
	
	private Book bookInput() {
		String bName;    // å����
		String author;     // ����
		String publ;        // ���ǻ�
		Scanner aScanner = new Scanner(System.in);
		while (true) {
			System.out.print("å �̸� : ");
			bName = aScanner.nextLine();
			if(0 == bName.length()) {
				System.out.println("�ùٸ� å �̸��� �Է��ϼ���.");
				continue;
			}
			break;
		}
		System.out.print("å ���� : ");
		author = aScanner.nextLine();
		if(0 == author.length()) {
			author = "�̻�";
		}
		System.out.print("���ǻ� : ");
		publ = aScanner.nextLine();
		if(0 == publ.length()) {
			publ = "�� �� ����";
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
	} // 2�� �߰�
		
	private void removeBook(int iIndex) {
		iIndex = 0; // ���� ������ ����
		Book [] delTemp = new Book [aBook.length - 1];
		for (int i = 0 ; i < delTemp.length ; i++) {
			delTemp[i] = aBook[i+1];
		}
		aBook = delTemp;
		
	} // 3�� ����
	
	private int searchBook() {
		String bName;    // å����
		Scanner aScanner = new Scanner(System.in);
		while (true) {
			System.out.print("å �̸� : ");
			bName = aScanner.nextLine();
			if(0 == bName.length()) {
				System.out.println("�ùٸ� å �̸��� �Է��ϼ���.");
				continue;
			}
			break;
		}
		for(int i = 0 ; i < aBook.length ; i++) {
			if(aBook[i].equals(bName)) {
				return i;
			}
		}
		return -1; // �˻� ���� ��
	} // 4�� �˻�
	
}
