package com.kh.practic.list.library.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.practic.list.library.controller.BookController;
import com.kh.practic.list.library.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		// ����ڰ� ���� ���� �޴��� ������ �� ����. ���� ������ �ݺ� ����. �� �޴��� ���� �� �ش� �޼ҵ�� �̵�
		
		System.out.println("=============KH���������� �������� ���� ���� ȯ���մϴ�^^!=============");
		System.out.println();
		int menuNo = 0;
		
		while(true) {
		try {	
		System.out.println("******** ���� �޴� ********");
		System.out.println("1. �� ���� �߰�");
		System.out.println("2. ���� ��ü ��ȸ");
		System.out.println("3. ���� �˻� ��ȸ");
		System.out.println("4. ���� ����");
		System.out.println("5. ���� �� �������� ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ ���� > ");
		menuNo = sc.nextInt();
		sc.nextLine();
		
		} catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է����ּ��� > ");
			sc.nextLine();
		}
		switch(menuNo) {
		
		case 1 : insertBook(); break;
		case 2 : selectList(); break;
		case 3 : searchBook(); break;
		case 4 : deleteBook(); break;
		case 5 : ascBook(); break;
		case 9 : System.out.println("���α׷��� �����մϴ�."); return;
		default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���."); break;
		
		} // switch
		
		
		} // while
	}
	
	public void insertBook() {
		// ���� �߰��� ���� ������ �޴� �޼ҵ�
		String category = "";
		System.out.print("�� ������ > ");
		String title = sc.nextLine();
		
		System.out.print("�����̸� > ");
		String author = sc.nextLine();
		
		System.out.println("1. �ι� / 2. �ڿ����� / 3. �Ƿ� / 4. ��Ÿ");
		System.out.print("�帣��ȣ > ");
		int categoryNo = sc.nextInt();
		sc.nextLine();
		
		if(categoryNo < 1 || categoryNo > 4) {
			System.out.println("���� �帣�Դϴ�. �ٽ� �������ּ���.");
		} else { 
			switch(categoryNo) {
			case 1 : category = "�ι�"; break;
			case 2 : category = "�ڿ�����";  break;
			case 3 : category = "�Ƿ�"; break; 
			case 4 : category = "��Ÿ"; break;			
			}
		
		}
		/*
		if(categoryNo <= 0 && categoryNo > 4) {
			System.out.println("���� �帣�Դϴ�. �ٽ� �������ּ���.");
		} else if(categoryNo == 1) {
			category = "�ι�";
			} else if(categoryNo == 2) {
				 category = "�ڿ�����";
			
				} else if(categoryNo == 3) {
					 category = "�Ƿ�";
					
					} else {
						 category = "��Ÿ";
					}
		*/
		System.out.print("���� > ");
		int price = sc.nextInt();
		
		boolean result = bc.insertBook(title, author, category, price);
		
		if(result) {
			System.out.println("���ο� ������ �߰��Ǿ����ϴ�.");
		} else {
			System.out.println("���� �߰��� �����Ͽ����ϴ�.");
		}
		
		

		
		
	}
	
	public void selectList() {
		// ��ü ���� ��� ��� ������ �˸��� �޼ҵ�
		// ��Ʈ�ѷ��� �ִ� ����Ʈ����Ʈ�� ����Ʈ<��>�� ����ִ� å ������ ����ؼ� �������ٷ�?
		// �ϰ� ���� ��ȯ���ָ� ���� ����ֳ� �Ⱥ���ֳ��� ���� ��¹��� �ۼ��غ���.
		
		List<Book> bookList = bc.selectList();
		// �ٳ�Դ��� å ������ ��� �ִ� list �� �ּҰ��� ��ȯ�Ǿ���?
		// ����ִ��� ������� ������ Ȯ���غ��� ������ �������
		
		if(bookList.isEmpty()) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
			
		}
		
		
		
	}
	
	public void searchBook() {
		// Ư�� ���� �˻� ����� �����ִ� �޼ҵ�
		// 1. �˻��� ������ Ű����� �Է¹ޱ� (String keyword)
		// ��Ʈ�ѷ��� searchBook() �޼ҵ�� Ű���� �Է°� ���� ��
		// ������� ������ ����Ʈ�� �����ϰ�
		// ������� �� ��ü�� �ƴ� ����Ʈ�� ���� --> ���� ���α׷����� Ű����� �˻��ϰ�, ����� �������� �� �ֱ⿡ ...
		
		System.out.print("Ű���带 �Է����ּ��� > ");
		String keyword = sc.nextLine();
		List<Book> book = bc.searchBook(keyword);
		
		if(book == null) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			
			for(int i = 0; i < book.size(); i++) {
				
				System.out.println(book.get(i));
			}
			
		}
	}
	
	public void deleteBook() {
		// Ư�� ���� ���� ������ �˸��� �޼ҵ�
		// 1. ������ ������ �Է� �ޱ� (String title)
		// 2. ������ ���ڸ� �Է� �ޱ� (String author)
		// ** ������� ���ڸ��� ���� �Է� �޴� ���� --> ���� �������̶�� �ص� ���ڸ��� �ٸ� ������ ���� �� �ֱ� ������
		// 3. bc�� deleteBook() �޼ҵ�� ���� title / author �� ���� �� ������� ������ Book(Book remove)�� �����϶�
		// 4. ���ǽ��� �̿��ؼ� remove �� �����ϴ� ��� "���������� �����߽��ϴ�" cnffur
		// 5. remove �� ������ ������ ������ ã�� ���߽��ϴ�. ���
		
		System.out.println("������ �������� �Է����ּ��� > ");
		String removeTitle = sc.nextLine();
		
		System.out.println("������ ������ ���ڸ��� �Է����ּ��� > ");
		String removeAuthor = sc.nextLine();
		
		Book removeBook = bc.deleteBook(removeTitle, removeAuthor);
		
		if(removeBook != null) {
		System.out.println("������ �����߽��ϴ�.");
		System.out.println(removeTitle + "��(��) �����߽��ϴ�.");
		} else {
			System.out.println("���� �����Դϴ�.");
		}
		
	}
	
	public void ascBook() {
		// å �� �������� ���� ������ �˸��� �޼ҵ�
		List<Book> ascBook = bc.ascBook();
		System.out.println(ascBook);
	}
}
